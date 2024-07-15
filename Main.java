//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setName("laptop");
        product.setId(1);
        product.setDescription( "acer laptop");
        product.setPrice(5000);
        product.setStockAmount(3);

        productManager productManager = new productManager();
        productManager.AddProduct(product);
        System.out.println(product.getName());


    }
}
//d