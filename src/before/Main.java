package before;

public class Main {
    public static void main(String[] args) {
        Item book = new Item(
            Item.TYPECODE_BOOK,
            "세계 역사",
            4800);

        Item dvd = new Item(
            Item.TYPECODE_DVD,
            "뉴욕의 꿈 특별판",
            3000);

        Item soft = new Item(
            Item.TYPECODE_SOFTWARE,
            "튜링 머신 에뮬레이터",
            3200);
        
        //리팩토링 전에는 상수 넣을경우 컴파일 단계에서 파악 불가능
        Item test = new Item(
                123,
                "튜링 머신 에뮬레이터",
                3200);
        
        System.out.println("book = " + book.toString());
        System.out.println("dvd  = " + dvd.toString());
        System.out.println("soft = " + soft.toString());
        System.out.println("test = " + test.toString());
    }
}
