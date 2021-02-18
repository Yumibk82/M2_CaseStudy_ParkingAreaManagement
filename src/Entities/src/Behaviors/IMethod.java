package Behaviors;

public interface IMethod <E>{
    void add(E obj);
    void update(E newObj,E previousObj);
    void remove(E obj);
    void show();
    E search(int licencePlate);
}
