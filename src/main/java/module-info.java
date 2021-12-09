module bsuir.java.web.oop {
    requires jakarta.xml.bind;

    opens by.bsuir.web.oop.entity to jakarta.xml.bind;
}