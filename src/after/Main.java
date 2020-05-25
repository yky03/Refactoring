package after;


public class Main {
    public static void main(String[] args) {
        Item book = new Item(
            ItemType.BOOK,
            "세계 역사",
            4800);

        Item dvd = new Item(
            ItemType.DVD,
            "뉴욕의 꿈 특별판",
            3000);

        Item soft = new Item(
            ItemType.SOFTWARE,
            "튜링 머신 에뮬레이터",
            3200);

        //리팩토링 후에는 상수 넣을경우 실행단계가 아닌 컴파일단계에서 판단 가능
        Item test = new Item(
                123,
                "튜링 머신 에뮬레이터",
                3200);
        
        System.out.println("book = " + book.toString());
        System.out.println("dvd  = " + dvd.toString());
        System.out.println("soft = " + soft.toString());
    }
}
