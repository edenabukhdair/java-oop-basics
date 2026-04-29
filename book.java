public class book {
    private String title;
    public void setTitle(String title) {
        this.title = title;}
    public String getTitle() {
        return title;}

    private int pages;
    public void setPages(int pages) {
        this.pages = pages;}
    public int getPages() {
        return pages;}

    public String toString() {
        return "book{title = " + title + ", pages = " + pages + "}";

    }
}
