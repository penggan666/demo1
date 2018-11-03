package com.example.demo1.Service;

import com.example.demo1.Bean.orign;
import com.example.demo1.Repository.orignRepository;
import com.example.demo1.Util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service

public class orignService {
    @Autowired
    public orignRepository orignRepository;
    public orignUtil orignUtil;
    @PersistenceContext
    protected EntityManager em;

    @Transactional
    public void save()
    {
        int num=0;
            List<orign> L = orignUtil.alldata1();
            for (int i = 0; i < L.size(); i++) {
                em.persist(L.get(i));
                if (i % 20000 == 0) {
                    em.flush();
                    em.clear();
                }
                num++;
                if (L.size() - num < 20000)
                    break;
                System.out.println(num);
            }
            for (int i = num; i < L.size(); i++) {
                em.persist(L.get(i));
                em.flush();
                em.clear();
            }
        System.out.println("finish");
    }
    public void sumUrl()
    {
        Set<String> s=new HashSet<>();
        int sum=0;
        int num=0;
        List<String> list=orignRepository.getAllurl();
        for(String ss:list) {
            if(ss==null)
                continue;
            else{
            s.add(ss);
            System.out.println(num++);}
        }
        System.out.println("finish");
        System.out.println(s.size());
        System.out.println(list.size());

        for(String o:s)
        {
            sum=0;
            for(String o1:list)
            {
                if(o1.equals(o))
                    sum++;
            }
            System.out.println(o+" "+sum);
        }
    }

}
