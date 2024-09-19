//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        list.traverse();
        list.unshift(0);
        list.unshift(-1);
        list.unshift(-2);
        list.unshift(-3);
        list.unshift(-4);
        list.traverse();
        list.backTraverse();

        System.out.println("POP -> " + list.pop());
        list.traverse();
        list.backTraverse();

        System.out.println("Shift -> " + list.shift());
        list.traverse();
        list.backTraverse();

        list.insert(10, 3);
        list.traverse();
        list.backTraverse();

        list.insert(20, 0);
        list.traverse();
        list.backTraverse();

        list.insert(30, list.length - 1);
        list.traverse();
        list.backTraverse();


        System.out.println("Remove from 0 -> " + list.remove(0));
        list.traverse();
        list.backTraverse();

        System.out.println("Remove from last -> " + list.remove(list.length - 1));
        list.traverse();
        list.backTraverse();

        System.out.println("Remove from 3 -> " + list.remove(3));
        list.traverse();
        list.backTraverse();
    }
}