/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.bbva.proyectobbva.model.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.DatatypeConverter;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.bbva.proyectobbva.model.entity.Banner;
import pe.bbva.proyectobbva.model.repository.BannerRepository;
import pe.bbva.proyectobbva.model.repository.config.MybatisUtil;
import pe.bbva.proyectobbva.model.service.BannerService;

/**
 *
 * @author Ronald Ramos <ronald.r.1806@gmail.com>
 * @date 06/09/2017 03:24:52 PM
 */
@Service
public class BannerServiceImpl implements BannerService {

    @Autowired
    BannerRepository bannerRepository;
    
    @Override
    public List<Banner> obtenerTodos() {
        List<Banner> listBanner = new ArrayList();
//        SqlSessionFactory ssf = MybatisUtil.;
//        try (SqlSession session = ssf.openSession()) {
//            BannerRepository bannerRepository = session.getMapper(BannerRepository.class);
            listBanner = bannerRepository.obtenerTodos();
            listBanner.forEach((banner) -> {
                banner.setsImagen(DatatypeConverter.printBase64Binary(banner.getImagen()));
            });
//        }
        return listBanner;

    }

}
