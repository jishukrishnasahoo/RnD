package spring.com.springweb;

class MyBook implements Comparable<MyBook> {
    private String title;
    private String author;
    private int price;

    public MyBook(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
    }

    @Override
    public int compareTo(MyBook b) {
        /*int i = this.title.compareTo(b.title); if (i != 0) return i;
        i = this.author.compareTo(b.author); if (i != 0) return i;
        return Integer.compare(this.price, b.price); }*/
        return 3;
    }

}

