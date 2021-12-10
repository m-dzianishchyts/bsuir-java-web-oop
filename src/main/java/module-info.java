module bsuir.java.web.oop {
    requires jakarta.xml.bind;
    requires org.apache.logging.log4j;

    opens by.bsuir.web.oop.entity to jakarta.xml.bind;
}