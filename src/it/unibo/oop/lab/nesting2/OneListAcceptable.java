package it.unibo.oop.lab.nesting2;

import java.util.Iterator;
import java.util.List;

public class OneListAcceptable<T> implements Acceptable<T> {

	List<T> l1;
	
	public OneListAcceptable(List<T> list) {
		this.l1 = list;
	}

	public Acceptor<T> acceptor() {
		Iterator<T> iterator = l1.iterator();
		return new Acceptor<T>(){
			public void accept(T newElement) throws Acceptor.ElementNotAcceptedException {
				try {
					if(newElement.equals(iterator.next())) {
						return ;
					}
				} catch (Exception e) {
					System.out.println("No more element");
				}
				throw new Acceptor.ElementNotAcceptedException(newElement);
			}

			public void end() throws Acceptor.EndNotAcceptedException {
				try {
					if(!iterator.hasNext()) {
						return ;
					}
				} catch (Exception e) {
					System.out.println("there are others elements!!");
				}
				throw new Acceptor.EndNotAcceptedException();
			}
			
		};
	}

}