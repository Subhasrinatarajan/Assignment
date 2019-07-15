package library;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class MembershipCardInfo {

	private static final Map<String, MembershipCard> memMap = new HashMap<String, MembershipCard>();

	static {
		initEmps();
	}

	private static void initEmps() {
		MembershipCard mem1 = new MembershipCard("1001", "dhivya", "divya@gmail.com", "7687678576", "2");
		MembershipCard mem2 = new MembershipCard("1002", "subha", "subha@gmail.com", "789053657", "3");
		MembershipCard mem3 = new MembershipCard("1003", "sasi", "sasi@gmail.com", "76543289766", "1");

		memMap.put(mem1.getMemCardId(), mem1);
		memMap.put(mem2.getMemCardId(), mem2);
		memMap.put(mem3.getMemCardId(), mem3);
	}

	public MembershipCard getMembershipCard(String memcardid) {
		return memMap.get(memcardid);
	}

	public MembershipCard addMembershipCard(MembershipCard mem) {
		memMap.put(mem.getMemCardId(), mem);
		return mem;
	}

	public MembershipCard updateMembershipCard(MembershipCard mem) {
		memMap.put(mem.getMemName(), mem);
		return mem;
	}

	public void deleteMembershipCard(String memcardid) {
		memMap.remove(memcardid);
	}

	public List<MembershipCard> getAllMembershipCards() {
		Collection<MembershipCard> c = memMap.values();
		List<MembershipCard> list = new ArrayList<MembershipCard>();
		list.addAll(c);
		return list;
	}
}
