package com.lm.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import com.lm.domain.EmpDetails;
import com.lm.utility.HibernateUtil;

public class CriteriaTest {
    public static void main(String[] args) {
		Session ses = HibernateUtil.getSession();
		Criteria criteria = ses.createCriteria(EmpDetails.class);		
		List<EmpDetails> list = criteria.list();
		for(EmpDetails e : list){
			System.out.println(e);
		}
	}
}
