use Prj1;

insert into Staff(staff_name, staff_tel, staff_address, staff_email, staff_id_card, account, password, position)
	values('Nguyen Long Nhat', '0966452513', 'Vinh Phuc', 'longnhat8556@gmail.com', '026200004041', 'df7ac565f8308523e45b3b528513d8bd', '80be2a761fe62ab3f023e3f77dc9b8dd', 'Staff'),
			('Nong Hong Cuong', '0338423581','Nang Thon', 'hiamcuong1@gmail.com', '082377587', '38ed25b6ec4c911283f7da1626e9cead', '7a98924465e161165a7fa692b11649f1', 'Manager');

insert into Shop(shop_name, shop_tel, shop_address)
    values('VTC Milk Tea', '0837827421', '18 Tam Trinh Hai Ba Trung Ha Noi');

insert into Drink(drink_code, drink_category, drink_name, drink_unit_price)
    values('MT01', 'Milk Tea', 'Matcha Red Bean', 40000),
        ('MT02', 'Milk Tea', 'Mango Milk Tea', 39000),
        ('MT03', 'Milk Tea', 'Peach Milk Tea', 39000),
        ('MT04', 'Milk Tea', 'Grape Milk Tea', 39000),
        ('MT05', 'Milk Tea', 'Pinaapple Milk Tea', 39000),
        ('MT06', 'Milk Tea', 'Lychee Milk Tea', 39000),
        ('MT07', 'Milk Tea', 'Strawberry Milk Tea', 39000),
        ('MT08', 'Milk Tea', 'Passion Fruit Milk Tea', 39000),
        ('MT09', 'Milk Tea', 'Signature Milk Tea ', 32000),
        ('MT010', 'Milk Tea', 'Jasime Green Milk Tea', 32000),
        ('MT011', 'Milk Tea', 'Oolong Milk Tea', 32000),
        ('MT012', 'Milk Tea', 'Taro Milk Tea', 32000),
        ('MT013', 'Milk Tea', 'Honey Milk Tea', 32000),
        ('MT014', 'Milk Tea', 'Hokkaido Milk Tea', 39000),
        ('MT015', 'Milk Tea', 'Raw Sugar Milk Tea', 39000),
        ('MT016', 'Milk Tea', 'Hazelnut Milk Tea', 39000),
        ('MT017', 'Milk Tea', 'Vanilla Milk Tea', 39000),
        ('MT018', 'Milk Tea', 'Chocolate Milk Tea', 32000),
        ('MT019', 'Milk Tea', 'Matcha Green Milk Tea', 32000),
        ('FtT01', 'Fruit Tea', 'Trà xanh / đen vị bưởi',32000),
        ('FtT02', 'Fruit Tea', 'Trà đen vị mận',32000),
        ('FtT03', 'Fruit Tea', 'Trà xanh / đen vị ô mai',32000),
        ('FtT04', 'Fruit Tea', 'Trà xanh / đen vị đào',32000),
        ('FtT05', 'Fruit Tea', 'Trà xanh / đen vị chanh leo',32000),
        ('FtT06', 'Fruit Tea', 'Trà xanh / đen vị dâu tây',32000),
        ('FtT07', 'Fruit Tea', 'Trà đen nho ',32000),
        ('FtT08', 'Fruit Tea', 'Trà xanh vải',32000),
        ('FtT09', 'Fruit Tea', 'Trà xanh dứa',32000),
        ('FtT010', 'Fruit Tea', 'Trà xanh xoài',32000),
        ('FtT011', 'Fruit Tea', 'Trà xanh mật ong',32000),
        ('FtT012', 'Fruit Tea', 'Trà xanh kiwi',32000),
        ('FtT013', 'Fruit Tea', 'Trà xanh quất',32000),
        ('FtT014', 'Fruit Tea', 'Trà xanh / đen đào',39000),
        ('FJ01', 'Fruit Juice', 'Nước chanh mận', 32000),
        ('FJ02', 'Fruit Juice', 'Nước chanh mật ong', 32000),
        ('FJ03', 'Fruit Juice', 'Nước bưởi', 32000),
        ('FJ04', 'Fruit Juice', 'Nước chanh leo', 32000),
        ('FJ05', 'Fruit Juice', 'Nước chanh quất', 39000),
        ('FJ06', 'Fruit Juice', 'Nước mật ong', 32000),
        ('FJ07', 'Fruit Juice', 'Nước bưởi', 32000),
        ('FJ08', 'Fruit Juice', 'Nước kiwi', 32000),
        ('FJ09', 'Fruit Juice', 'Nước vải', 32000),
        ('FhT01', 'Fresh Tea', 'Hồng trà', 25000),
        ('FhT02', 'Fresh Tea', 'Xanh nhài', 25000),
        ('FhT03', 'Fresh Tea', 'Trà oolong', 25000),
        ('FhT04', 'Fresh Tea', 'Hồng trà đường đen', 32000),
        ('FhT05', 'Fresh Tea', 'Trà oolong đường đen', 32000),
        ('Latte01', 'Latte', 'Hồng trà latte', 42000),
        ('Latte02', 'Latte', 'Khoai môn latte', 52000),
        ('Latte03', 'Latte', 'Xanh nhài latte', 42000),
        ('Latte04', 'Latte', 'Matcha latte', 52000),
        ('C01', 'Coffee', 'Cà phê hokkaido', 39000),
        ('C02', 'Coffee', 'Cà phê mocha', 39000),
        ('C03', 'Coffee', 'Cà phê hạt dẻ', 39000),
        ('C04', 'Coffee', 'Cà phê va-ni', 39000),
        ('C05', 'Coffee', 'Cà phê đặc biệt', 32000),
        ('YY01', 'Yogurt & Yakult' , 'Green Tea Yakult', 39000),
        ('YY02', 'Yogurt & Yakult' , 'Passion Fruit Yakult', 39000),
        ('YY03', 'Yogurt & Yakult' , 'Grapefruit Yakult', 39000),
        ('YY04', 'Yogurt & Yakult' , 'Grape Yakult', 39000),
        ('YY05', 'Yogurt & Yakult' , 'Pineapple Yakult', 39000),
        ('YY06', 'Yogurt & Yakult' , 'Mango Yakult', 39000),
        ('YY07', 'Yogurt & Yakult' , 'Stawberry Yogurt', 39000),
        ('HD01', 'Hot drink', 'Ginger Tea', 25000),
        ('HD02', 'Hot drink', 'Ginger Milk Tea', 32000);
        
call sp_insertInvoice(1,1);
call sp_insertInvoiceDetails(1,'HD02', 10);
call sp_insertInvoiceDetails(1,'HD01', 10);
call sp_insertInvoiceDetails(1,'YY07', 10);
call sp_insertInvoiceDetails(1,'YY06', 10);