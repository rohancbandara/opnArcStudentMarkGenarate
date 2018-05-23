package com.rcb.dao;

import java.util.List;

import com.rcb.model.Subject;
import com.rcb.utility.DbConnection;

public class SubjectDAOImpl extends DbConnection implements SubjectDAO{

	@Override
	public boolean insertSubject(Subject subject) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Subject> listAllSubject() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteSubject(Subject subject) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateSubject(Subject subject) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Subject> listSelectedSubject(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
