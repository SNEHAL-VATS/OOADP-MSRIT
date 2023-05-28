package Observer_Behavioural;

public abstract class Subject {
	abstract void register(Observer o);
	abstract void Notify();
	abstract void unregister(Observer o);
	

}
