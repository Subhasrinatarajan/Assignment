package library;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MainRESTController {

	@Autowired
	private MembershipCardInfo membershipcardinfo;

	@RequestMapping("/")
	@ResponseBody
	public String welcome() {
		return "Welcome to MembershipCard Details";
	}

	@RequestMapping(value = "/MembershipCards", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	@ResponseBody
	public List<MembershipCard> getMembershipCards() {
		List<MembershipCard> list = membershipcardinfo.getAllMembershipCards();
		return list;
	}

	@GetMapping
	@RequestMapping(value = "/MembershipCard/{memcardid}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE,

			MediaType.APPLICATION_XML_VALUE })
	@ResponseBody
	public MembershipCard getMembershipCard(@PathVariable("memcardid") String memcardid) {
		return membershipcardinfo.getMembershipCard(memcardid);
	}

	@RequestMapping(value = "/MembershipCard", method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	@ResponseBody
	public MembershipCard addMembershipCard(@RequestBody MembershipCard mem) {

		System.out.println("(Service Side) Creating MembershipCard: " + mem.getMemCardId());

		return membershipcardinfo.addMembershipCard(mem);
	}

	@RequestMapping(value = "/MembershipCard", method = RequestMethod.PUT, produces = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	@ResponseBody
	public MembershipCard updateMembershipCard(@RequestBody MembershipCard mem) {

		System.out.println("(Service Side) Editing Membershipcard: " + mem.getMemCardId());

		return membershipcardinfo.updateMembershipCard(mem);
	}

	@RequestMapping(value = "/MembershipCard/{memcardid}", method = RequestMethod.DELETE, //
			produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	@ResponseBody
	public void deleteEmployee(@PathVariable("memcardid") String memcardid) {

		System.out.println("(Service Side) Deleting MembershipCard: " + memcardid);

		membershipcardinfo.deleteMembershipCard(memcardid);
	}

}