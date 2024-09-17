package Repository;

import lists.ProductoList;
import modelos.*;

import java.util.List;

public class EjemploRepositorio {

    public static void main(String[] args) {

        BolsaSupermercado<Lacteo> bolsaLacteos = new BolsaSupermercado<>();

        System.out.println("********* Lacteos ***************");

        Lacteo leche = new Lacteo("leche_colanta",20000.0,2,300);
        Lacteo yogurt = new Lacteo("alpina",2000.0,1,10);
        Lacteo queso = new Lacteo("Parmalat",5000.0,1,300);
        Lacteo cuajada = new Lacteo("cuajadita",3500.0,1,100);
        Lacteo kumis = new Lacteo("Kumis",4500.0,1,80);

        bolsaLacteos.addProductos(leche);
        bolsaLacteos.addProductos(yogurt);
        bolsaLacteos.addProductos(queso);
        bolsaLacteos.addProductos(cuajada);
        bolsaLacteos.addProductos(kumis);

        imprimir(bolsaLacteos);

        BolsaSupermercado<Fruta> bolsaFrutas = new BolsaSupermercado<>();

        Fruta manzana = new Fruta("Manzana",2000.0,10.0,"Roja");
        Fruta pera = new Fruta("pera",2500.0,18.0,"cafe");
        Fruta uvas = new Fruta("uvas",6000.0,100.0,"moradas");
        Fruta banano = new Fruta("banano",4000.0,500.0,"amarillos");
        Fruta zapote = new Fruta("zapote",5000.0,10.0,"cafe");
        Fruta fresa = new Fruta("fresa",7000.0,250.0,"roja");

        System.out.println("********* Frutas ***************");

        bolsaFrutas.addProductos(manzana);
        bolsaFrutas.addProductos(pera);
        bolsaFrutas.addProductos(uvas);
        bolsaFrutas.addProductos(banano);
        bolsaFrutas.addProductos(zapote);

        imprimir(bolsaFrutas);
        //Se intenta agregar un elemento adicional para mostrar que
        //el objeto no recibe mas de 5 elementos
        bolsaFrutas.addProductos(fresa);

        BolsaSupermercado<Limpieza> bolsaLimpieza = new BolsaSupermercado<>();

        Producto clorox = new Limpieza("Clorox",2000.0,"Hipoclorito de sodio", 1.0);
        Producto detergente = new Limpieza("fab",4000.0,"surfactantes", 1.0);
        Producto jabonPersonal = new Limpieza("parami",1000.0,"Acidos grasos", 1.0);
        Producto shampoo = new Limpieza("jhonson",13800.0,"Tensioactivos ", 1.0);
        Producto acondicionador = new Limpieza("sabiloe",12000.0,"Emolientes", 1.0);

        imprimir(bolsaLimpieza);

        BolsaSupermercado<NoPerecible> bolsaNoPerecible = new BolsaSupermercado<>();

        Producto choclitos = new NoPerecible("Snakcs_Choclitos",6000.0,460,800);
        Producto arroz = new NoPerecible("Arroz_Roa",9000.0,25,50);
        Producto miel = new NoPerecible("miel",20000.0,500,200);
        Producto mani = new NoPerecible("Mani",1500.0,30,200);
        Producto chocorramo = new NoPerecible("Snaks_Chocorramo",1500.0,30,200);


        System.out.println("************** REPOSITORIO***************");
        FullRepository repositorio = new ProductoList();

        repositorio.crear(leche);
        repositorio.crear(fresa);
        repositorio.crear(clorox);
        repositorio.crear(mani);
        repositorio.crear(miel);

        imprimir(repositorio);

        System.out.println("******************* ORDENANDO DESCENDENTEMENTE ID ************");

        List<Producto> listaProductos = repositorio.ordenarLista("id",Direccion.DESC);

        imprimir(listaProductos);

        System.out.println("********************* EDITAR REGISTRO *************");

        Producto panela = new Producto("Panela",1000.0);
        panela.setId(1);
        repositorio.editar(panela);
        imprimir(repositorio);

        System.out.println("**************************** TOTAL REGISTROS ******************");
        System.out.println("Total registros: " + repositorio.totalRegistros());
    }

    public static <T extends BolsaSupermercado> void imprimir(T t){

        for (Object p : t.getListaProductos()){

            System.out.println(p);
        }
    }

    public static <T extends FullRepository> void imprimir(T t){

        for (Object p : t.listar()){

            System.out.println(p);
        }

    }

    public static <T> void imprimir(List<T> t){

        for (T elemento : t){

            System.out.println(elemento);
        }
    }
}
