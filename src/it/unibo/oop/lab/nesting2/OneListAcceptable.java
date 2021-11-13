package it.unibo.oop.lab.nesting2;

import java.util.Iterator;
import java.util.List;

public class OneListAcceptable<T> implements Acceptable<T> {
	
	final private List<T> list;

	public OneListAcceptable(final List<T> list) {
		this.list = list;
	}



	@Override
	public Acceptor<T> acceptor() {
		final Iterator<T> iterator = list.iterator();
		return new Acceptor<T>() {
			
			/**
			 * @param elem
			 * 			new element to be accepted
			 */
			@Override
			public void accept(final T elem) throws Acceptor.ElementNotAcceptedException {
				if (!iterator.hasNext() || !elem.equals(iterator.next())) {
					throw new Acceptor.ElementNotAcceptedException(elem);
				}
			}
			
			@Override
			public void end() throws Acceptor.EndNotAcceptedException {
				if (iterator.hasNext()) {
					throw new Acceptor.EndNotAcceptedException();
				}
			}
		};
	}

}
