package pe.bbva.proyectobbva.main;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import pe.bbva.proyectobbva.model.entity.Banner;
import pe.bbva.proyectobbva.model.entity.Usuario;
import pe.bbva.proyectobbva.model.repository.BannerRepository;
import pe.bbva.proyectobbva.model.repository.UsuarioRepository;

@Configuration
@ComponentScan("pe.bbva.proyectobbva")
@EnableTransactionManagement
public class PruebaSpring {

    public static void main(String[] args) {
        ApplicationContext ctx
                = new AnnotationConfigApplicationContext(PruebaSpring.class);
//        BannerRepository bannerRepository = ctx.getBean(BannerRepository.class);
//        List<Banner> list = bannerRepository.obtenerTodos();
//         
//        for (Banner banner : list) {
//            System.out.println(banner);
//        
        UsuarioRepository usuarioRepository = ctx.getBean(UsuarioRepository.class);
        Usuario us = usuarioRepository.obtenerDatosUsuario("74217290");
        System.out.println("u: "+us.toString());
//        VehiculoRepository vehiculoRepository =
//            ctx.getBean(VehiculoRepository.class);
//        List<Vehiculo> lista = vehiculoRepository.obtenerTodos();
//        lista.forEach(System.out::println);
    }
}
