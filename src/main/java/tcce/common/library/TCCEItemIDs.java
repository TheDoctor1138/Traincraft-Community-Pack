/*******************************************************************************
 * Copyright (c) 2012 mrbrutal. All rights reserved.
 *
 * @name TrainCraft
 * @author mrbrutal
 ******************************************************************************/

package tcce.common.library;

import net.minecraft.item.Item;

public enum TCCEItemIDs {

	//Items

	recipeBook("ItemRecipeBook", "item_book_blue", 1),


	//RollingStock

	minecartBR_Black_5("ItemRollingStock", "BR_Black_5", 5),
	minecartBR_Black_5_Tender("ItemRollingStock", "BR_Black_5_Tender", 1),
	minecartBR1Tender("ItemRollingStock", "BR1_Tender_Icon", 1),
	minecartRWType2("ItemRollingStock", "Type_2_Loco_Icon",3),
	minecartRWType2Tender("ItemRollingStock", "Type_2_Tender_Icon", 1),
	minecartShuntingTenderUK("ItemRollingStock", "shunting_tender_icon",1),
	minecartLocoCF7("ItemRollingStock", "train_cf7", 4),
	minecartLocoGP15("ItemRollingStock", "train_gp15", 4),
	minecartLocoSW8("ItemRollingStock", "train_sw8", 4),
	minecartLocoRenfe446Motor("ItemRollingStock", "446_motor_icon", 3),
	minecartPassengerRenfe446Coach("ItemRollingStock", "446_middle_icon", 3),
	minecartCabooseRenfe446Tail("ItemRollingStock", "446_tail_icon", 3),
	minecartPCH120Commute("ItemRollingStock", "pch120", 4),
	minecartPCH120Car("ItemRollingStock", "pch120car", 3),
	minecartLUengine("ItemRollingStock","luengine", 4),
	minecartLUcar("ItemRollingStock","lupassenger", 3),
	minecartDstockEngine("ItemRollingStock","DstockEngine", 4),
	minecartDstockCar("ItemRollingStock","DstockCar", 3),
	minecartClass345engine("ItemRollingStock", "Class345Engine", 4),
	minecartClass345car("ItemRollingStock", "Class345Coach", 3),
	minecartPS52seatCoach("ItemRollingStock", "PS52seatCoach", 3),
	minecartPScombine("ItemRollingStock", "PScombine", 3),
	minecartPSCenterDiner("ItemRollingStock", "PScenterDiner", 3),
	minecartPSAnotherDiner("ItemRollingStock", "BAP_Pullman_Standard_lightweight_center_diner_icom", 3),
	minecartBNLRV_B("ItemRollingStock", "BNLRV_B", 1 ),
	minecartBNLRV_A("ItemRollingStock", "BNLRV_A", 1 ),
	minecartPassengerBW305("ItemRollingStock","bw_icon",3),
	minecartLocoElectricTW305("ItemRollingStock","tw_icon",5),
	minecartMetro2000Loco("ItemRollingStock", "metro2000_motor", 5),
	minecartMetro2000Passenger("ItemRollingStock", "metro2000_Tail", 5),
	minecartLocoRenfe450Motor("ItemRollingStock", "450_front_icon", 3),
	minecartPassengerRenfe450Coach("ItemRollingStock", "450_middle_icon", 3),
	minecartCabooseRenfe450Tail("ItemRollingStock", "450_tail_icon", 3),
	minecartCD814("ItemRollingStock", "CD814", 2),
	minecartCD014("ItemRollingStock", "CD014", 2),
	minecartCD914("ItemRollingStock", "CD914", 2),
	minecartCD810("ItemRollingStock", "CD810", 2),
	minecartCD010("ItemRollingStock", "CD010", 2),
	minecartLocoSteamVBShay("ItemRollingStock", "train_vbshay", 4),
	minecartClimaxNew("ItemRollingStock", "train_climax2", 5),
	minecartRoundHopper("ItemRollingStock", "train_RoundHopper", 2),
	minecartRibbedHopper("ItemRollingStock", "train_ribbed_hopper", 2),
	minecartLocoSM42("ItemRollingStock", "train_sm42", 4),
	minecartLocoC11("ItemRollingStock", "train_C11", 5),
	minecartLocoGE44Ton("ItemRollingStock", "44-tonner_icon", 4),
	minecart40highcube("ItemRollingStock", "40highcube", 3),
	minecartWoodchipHopper("ItemRollingStock", "woodchiphopper", 4),
	minecartOreJenny("ItemRollingStock", "orejenny", 2),
	minecartMillGondola("ItemRollingStock", "millgondola", 4),
	minecartMILW40boxcar("ItemRollingStock", "milw40", 3),
	minecart60centerbeam("ItemRollingStock", "60centerbeam", 3),
	minecart66centerbeam("ItemRollingStock", "66centerbeam", 3),
	minecart73centerbeam("ItemRollingStock", "73centerbeam", 4),
	minecartPS140("ItemRollingStock", "ps140", 3),
	minecartPS150("ItemRollingStock", "ps150", 4),
	minecartPS160("ItemRollingStock", "ps160", 5),
	minecartWVcaboose("ItemRollingStock", "wvcaboose",3),
	minecartPEcooch("ItemRollingStock", "pecoach", 6),
	minecartPEobserve("ItemRollingStock", "peobserve", 6),


	;

	public Item item;
	public String className;
	public String iconName;

	/**
	 * amount for one emerald. For ItemRollingStock, it is the price for one train
	 */
	public int amountForEmerald;

	/**
	 * @param classMethodName
	 * @param iconName
	 * @param amountForEmerald for one emerald. For ItemRollingStock, it is the price for one train
	 */
	TCCEItemIDs(String classMethodName, String iconName, int amountForEmerald) {
		this.className = classMethodName;
		this.iconName = iconName;
		this.amountForEmerald = amountForEmerald;
	}

}