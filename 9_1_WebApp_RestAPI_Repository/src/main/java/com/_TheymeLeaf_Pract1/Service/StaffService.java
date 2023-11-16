package com._TheymeLeaf_Pract1.Service;

import java.util.List;
import org.springframework.stereotype.Service;

import com._TheymeLeaf_Pract1.Data.StaffRepository;
import com._TheymeLeaf_Pract1.Model.Staff;

@Service
public class StaffService {
	
	private final StaffRepository staffRepository; 
	
//	private static final List<Staff> staffs = new ArrayList<>();
//	
//	static {
//			staffs.add(new Staff(UUID.randomUUID().toString(), "Deepak", "Ugale", Position.SECURITY));
//			staffs.add(new Staff(UUID.randomUUID().toString(), "Deep", "Ugale1", Position.FRONT_DESK));
//			staffs.add(new Staff(UUID.randomUUID().toString(), "Deepak2", "Ugale2", Position.CONCIERGE));
//			staffs.add(new Staff(UUID.randomUUID().toString(), "Deepak3", "Ugale3", Position.SECURITY));
//			staffs.add(new Staff(UUID.randomUUID().toString(), "Manali", "Rahangdhale", Position.HOUSEKEEPING));		
//	}
	
	public StaffService(StaffRepository staffRepository) {
		
		this.staffRepository = staffRepository;
	}

	public List<Staff> getAllStaffs() {
		return staffRepository.findAll();
	}

}
