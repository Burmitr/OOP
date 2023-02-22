package vending_automat;
/*
1.1 
Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат, содержащий 
в себе методы initProducts (List <Product>) сохраняющий в себе список исходных продуктов
и getProduct(String name)
1.2
Реализовать конструкторы, get/set методы, построить логику ТорговогоАвтомата на
основе кода сделанного в задании 1.2
1.3
Сделать класс Товар абстрактным, создать нескольких наследников (к примеру: БутылкаВоды),
сделать интерфейсом ТорговыйАвтомат и реализовать класс какого-то одного типа ТорговогоАвтомата
(пример: ПродающийБутылкиВодыАвтомат
1.4
Попросить вначале переопределить метод toString для Товара, запустить программу,
после этого переопределить для наследника этот метод, после запуска обратить внимание на
изменение поведения. (10 минут)
1.5
Попросить создать перегруженный метод выдачи товара ТорговымАвтоматом дополнив дополнительным
входным параметром (пример: getProduct(String name) выдающий товар по имени, создать метод возвращающий
товар по имени и какому-либо параметру товара getProduct(String name, int volume) (10 минут) 
*/

/**
 * Wending_automat
 */
public class Product {
    private String name;
    private int cost;

    public Product (String name, int cost){
        this.name = name;
        this.cost = cost;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return String.format("Наименование товара - %s. Цена: %d", name, cost);

    }
}