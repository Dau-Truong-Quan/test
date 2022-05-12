package test;

public class main {

	public static void main(String[] args) {

		if ("".matches(FULLNAME_PATTERN)) {
			System.out.println("ok");
			System.out.println("ok");
		}

	}

	private static final String FULLNAME_PATTERN = "^[a-zA-Z_ÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶ" +
			"ẸẺẼỀỀỂưăạảấầẩẫậắằẳẵặẹẻẽềềểỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễệỉịọỏốồổỗộớờởỡợ" +
			"ụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ\\s]+$";

}
