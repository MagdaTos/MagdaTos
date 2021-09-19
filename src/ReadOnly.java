public class ReadOnly {
    private String name = "Bartek";

    //Getter to coś co zwróci nam nazwę pola name

/*
    public String getName() {
        return name + "jest ok";
*/
 // Setter umożliwia przypisanie wartości do pola name
// skrót klawiszowy: alt + Insert

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
