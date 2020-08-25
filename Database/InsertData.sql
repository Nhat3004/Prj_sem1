use Prj1;

insert into Staff(staff_name, staff_tel, staff_address, staff_email, staff_id_card, account, password, position)
	values('Nguyễn Long Nhật', '0966452513', 'Vĩnh Phúc', 'longnhat8556@gmail.com', '02620004041', 'df7ac565f8308523e45b3b528513d8bd', '80be2a761fe62ab3f023e3f77dc9b8dd', 'Staff'),
			('Nông Hồng Cương', '0338423581','Nạng Thơn', 'hiamcuong1@gmail.com', '082377587', '38ed25b6ec4c911283f7da1626e9cead', '7a98924465e161165a7fa692b11649f1', 'Manager');

insert into Shop(shop_name, shop_tel, shop_address)
    values('VTC Milk Tea', '0837827421', '18 Tam Trinh Hai Bà Trưng Hà Nội');

insert into Drink(drink_code, drink_category, drink_name, drink_unit_price)
    values('MT01', 'Trà sữa', 'Trà sữa Matcha đậu đỏ', 40000),
        ('MT02', 'Trà sữa', 'Trà sữa xoài', 39000),
        ('MT03', 'Trà sữa', 'Trà sữa đào', 39000),
        ('MT04', 'Trà sữa', 'Trà sữa bưởi', 39000),
        ('MT05', 'Trà sữa', 'Trà sữa táo', 39000),
        ('MT06', 'Trà sữa', 'Trà sữa vải', 39000),
        ('MT07', 'Trà sữa', 'Trà sữa dâu tây', 39000),
        ('MT08', 'Trà sữa', 'Trà sữa chanh leo', 39000),
        ('MT09', 'Trà sữa', 'Hồng trà sữa ', 32000),
        ('MT010', 'Trà sữa', 'Nhài sữa ', 32000),
        ('MT011', 'Trà sữa', 'Trà sữa oolong', 32000),
        ('MT012', 'Trà sữa', 'Trà sữa khoai môn ', 32000),
        ('MT013', 'Trà sữa', 'Trà sữa mật ong', 32000),
        ('MT014', 'Trà sữa', 'Trà sữa hokkaido', 39000),
        ('MT015', 'Trà sữa', 'Trà sữa đường đen', 39000),
        ('MT016', 'Trà sữa', 'Trà sữa hạt dẻ', 39000),
        ('MT017', 'Trà sữa', 'Trà sữa vanilla', 39000),
        ('MT018', 'Trà sữa', 'Trà sữa socola', 32000),
        ('MT019', 'Trà sữa', 'Trà sữa matcha', 32000),
        ('FtT01', 'Trà trái cây', 'Trà xanh / đen vị bưởi',32000),
        ('FtT02', 'Trà trái cây', 'Trà đen vị mận',32000),
        ('FtT03', 'Trà trái cây', 'Trà xanh / đen vị ô mai',32000),
        ('FtT04', 'Trà trái cây', 'Trà xanh / đen vị đào',32000),
        ('FtT05', 'Trà trái cây', 'Trà xanh / đen vị chanh leo',32000),
        ('FtT06', 'Trà trái cây', 'Trà xanh / đen vị dâu tây',32000),
        ('FtT07', 'Trà trái cây', 'Trà đen nho ',32000),
        ('FtT08', 'Trà trái cây', 'Trà xanh vải',32000),
        ('FtT09', 'Trà trái cây', 'Trà xanh dứa',32000),
        ('FtT010', 'Trà trái cây', 'Trà xanh xoài',32000),
        ('FtT011', 'Trà trái cây', 'Trà xanh mật ong',32000),
        ('FtT012', 'Trà trái cây', 'Trà xanh kiwi',32000),
        ('FtT013', 'Trà trái cây', 'Trà xanh quất',32000),
        ('FtT014', 'Trà trái cây', 'Trà xanh / đen đào',39000),
        ('FJ01', 'Nước trái cây', 'Nước chanh mận', 32000),
        ('FJ02', 'Nước trái cây', 'Nước chanh mật ong', 32000),
        ('FJ03', 'Nước trái cây', 'Nước bưởi', 32000),
        ('FJ04', 'Nước trái cây', 'Nước chanh leo', 32000),
        ('FJ05', 'Nước trái cây', 'Nước chanh quất', 39000),
        ('FJ06', 'Nước trái cây', 'Nước mật ong', 32000),
        ('FJ07', 'Nước trái cây', 'Nước bưởi', 32000),
        ('FJ08', 'Nước trái cây', 'Nước kiwi', 32000),
        ('FJ09', 'Nước trái cây', 'Nước vải', 32000),
        ('FhT01', 'Trà Đài Loan đặc biệt', 'Hồng trà', 25000),
        ('FhT02', 'Trà Đài Loan đặc biệt', 'Xanh nhài', 25000),
        ('FhT03', 'Trà Đài Loan đặc biệt', 'Trà oolong', 25000),
        ('FhT04', 'Trà Đài Loan đặc biệt', 'Hồng trà đường đen', 32000),
        ('FhT05', 'Trà Đài Loan đặc biệt', 'Trà oolong đường đen', 32000),
        ('Latte01', 'Latte', 'Hồng trà latte', 42000),
        ('Latte02', 'Latte', 'Khoai môn latte', 52000),
        ('Latte03', 'Latte', 'Xanh nhài latte', 42000),
        ('Latte04', 'Latte', 'Matcha latte', 52000),
        ('C01', 'Coffee', 'Cà phê hokkaido', 39000),
        ('C02', 'Coffee', 'Cà phê mocha', 39000),
        ('C03', 'Coffee', 'Cà phê hạt dẻ', 39000),
        ('C04', 'Coffee', 'Cà phê va-ni', 39000),
        ('C05', 'Coffee', 'Cà phê đặc biệt', 32000),
        ('YY01', 'Sữa chua uống' , 'Sữa chua uống vị trà xanh', 39000),
        ('YY02', 'Sữa chua uống' , 'Sữa chua uống vị chanh leo', 39000),
        ('YY03', 'Sữa chua uống' , 'Sữa chua uống vị bưởi', 39000),
        ('YY04', 'Sữa chua uống' , 'Sữa chua uống vị nho', 39000),
        ('YY05', 'Sữa chua uống' , 'Sữa chua uống vị dứa', 39000),
        ('YY06', 'Sữa chua uống' , 'Sữa chua uống vị xoài', 39000),
        ('YY07', 'Sữa chua uống' , 'Sữa chua uống vị dâu tây', 39000),
        ('HD01', 'Đồ uống nóng', 'Trà gừng', 25000),
        ('HD02', 'Đồ uống nóng', 'Trà sữa gừng', 32000);
        
call sp_insertInvoice(1,1);
call sp_insertInvoiceDetails(1,'HD02', 10);
call sp_insertInvoiceDetails(1,'HD01', 10);
call sp_insertInvoiceDetails(1,'YY07', 10);
call sp_insertInvoiceDetails(1,'YY06', 10);