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

	//Rollingstock

	minecartBoulderWagon("ItemRollingStock", "BoulderWagon", 1),
	minecartKVB_2300("ItemRollingStock", "kvb_2300", 3),
	minecartKVB_2300_B("ItemRollingStock", "kvb_2300_b", 3),
	minecartBR_Mk1_BSO("ItemRollingStock", "Mk1_BSO_Icon", 3),
	minecartBR_Mk1_TSO("ItemRollingStock", "Mk1_TSO_Icon", 3),
	minecartBR_Mk1_Buffet("ItemRollingStock", "Mk1_Buffet_Icon", 3),
	minecartBR_Mk1_BG("ItemRollingStock", "Mk1_BG_Icon", 3),
	minecartBR_Mk1_TPO_Stowage("ItemRollingStock", "Mk1_TPO_Stowage_Icon", 3),
	minecartBR_Mk2c_BSO("ItemRollingStock", "Mk2c_BSO_Icon", 3),
	minecartBR_MK2C_Coach("ItemRollingStock", "Mk2c_Coach_Icon", 3),
	minecartBR_MK2F_Coach("ItemRollingStock", "Mk2f_Coach_Icon", 3),
	minecartBR_Mk2f_BSO("ItemRollingStock", "Mk2f_BSO_Icon", 3),
	minecartBR_MK3_DVT("ItemRollingStock", "br_mk3_dvt", 3),
	minecartBR_MK3_Buffet("ItemRollingStock", "br_mk3_buffet", 3),
	minecartBR_MK3_Coach("ItemRollingStock", "br_mk3_coach", 3),
	minecartBR_MK3a_Coach("ItemRollingStock", "Mk3a_Coach_Icon", 3),
	minecartBR_MK3_Pantograph("ItemRollingStock", "Mk3_Pantograph", 3),
	minecartBR_MK4_DVT("ItemRollingStock","br_mk4_dvt",5),
	minecartBR_MK4_Coach("ItemRollingStock","br_mk4_coach",3),
	minecartBR_MK4_Buffet("ItemRollingStock", "br_mk4_buffet", 3),
	minecartClass43("ItemRollingStock", "class43",5),
	minecartClass90("ItemRollingStock", "class90", 5),
	minecartClass91("ItemRollingStock", "class91", 5),
	minecartClass321("ItemRollingStock","class321", 5),
	minecartClass321Panto("ItemRollingStock","class321panto",3),
	minecartClass321Coach("ItemRollingStock","class321coach", 3),
	minecartMetro2000Loco("ItemRollingStock", "metro2000_motor", 5),
	minecartMetro2000Passenger("ItemRollingStock", "metro2000_Tail", 5),
	minecartPassengerBW305("ItemRollingStock","bw_icon",3),
	minecartLocoElectricTW305("ItemRollingStock","tw_icon",5),
	minecartLocoElectricInterurbanSeries100("ItemRollingStock","Interurban_100_icon",2),
	minecartLocoCF7("ItemRollingStock", "train_cf7", 4),
	minecartLocoGP15("ItemRollingStock", "train_gp15", 4),
	minecartLocoSW8("ItemRollingStock", "train_sw8", 4),
	minecartLocoSM42("ItemRollingStock", "train_sm42", 4),

	minecartLocoGE44Ton("ItemRollingStock", "44-tonner_icon", 4),
	minecartF7A("ItemRollingStock", "f7a", 5),
	minecartF7B("ItemRollingStock", "f7b", 5),
	minecartH1044("ItemRollingStock", "h1044", 4),
	minecartGP13("ItemRollingStock", "gp13", 9),
	minecartB23("ItemRollingStock", "b23", 5),
	minecartC424("ItemRollingStock", "c424", 5),
	minecartC425("ItemRollingStock", "c425", 5),
	minecartGP9("ItemRollingStock", "gp9", 4),
	minecartGP7b("ItemRollingStock", "gp7b", 4),
	minecartGP7u("ItemRollingStock", "gp7u", 4),
	minecartGP7("ItemRollingStock", "gp7", 4),
	minecartGP30("ItemRollingStock", "gp30", 5),
	minecartGP38dash2("ItemRollingStock", "gp38dash2", 5),
	minecartKofIII("ItemRollingStock", "KofIII_Icon", 3),
	minecartKofIIIM("ItemRollingStock", "KofIII_Modernized_Icon", 3),
	minecartU36C( "ItemRollingStock", "u36c", 6),
	minecartGP49("ItemRollingStock", "gp49", 5),
	minecartGP15("ItemRollingStock", "gp15", 4),
	minecartSD9("ItemRollingStock", "sd9", 4),
	minecartSD40dash2("ItemRollingStock", "sd40dash2", 6),
	minecartU23B("ItemRollingStock", "u23b", 4),
	minecartU18B("ItemRollingStock", "U18B", 3),
	minecartHH660("ItemRollingStock", "hh660", 2),
	minecartKrautt("ItemRollingStock", "ML4000", 5),
	minecartDash840B("ItemRollingStock", "B40-8", 4),
	minecartDash840C("ItemRollingStock", "C40-8", 4),
	minecartClass44("ItemRollingStock", "Class44Icon", 4),
	minecartSW1("ItemRollingStock","sw1", 2),
	minecartSW1500("ItemRollingStock", "sw1500", 4),
	minecartSW1200("ItemRollingStock","sw1200", 3),
	minecartRSD15("ItemRollingStock","RSD15_Icon", 4),
	minecartES44("ItemRollingStock", "es44", 8),
	minecartSD70Mac("ItemRollingStock", "sd70mac", 7),
	minecartDash9_44CW("ItemRollingStock", "d944cw", 7),
	minecartDash840BB("ItemRollingStock", "B40-8B", 4),
	minecartDash840BW("ItemRollingStock", "B40-8W", 4),
	minecartDH643("ItemRollingStock", "DH643", 5),
	minecartAlcoS2("ItemRollingStock", "alco_s2", 2),
	minecartCF7("ItemRollingStock", "cf7angle", 3),
	minecartCF7round("ItemRollingStock", "cf7round", 3),
	minecartBeep("ItemRollingStock", "BeepIcon", 2),
	minecartNRE3gs21b("ItemRollingStock", "3gs21b", 4),
	minecartGP38dash9W("ItemRollingStock", "gp38dash9w", 3),

	minecartClimaxNew("ItemRollingStock", "train_climax2", 5),
	minecartVBShay2("ItemRollingStock", "vbshay2", 5),
	minecartLocoC11("ItemRollingStock", "train_C11", 5),
	minecartStarClass("ItemRollingStock", "StarIcon", 3),
	minecartStarClassTender("ItemRollingStock", "StarTenderIcon", 3),
	minecartOnion("ItemRollingStock", "Onion", 10),
	minecartOnionTender("ItemRollingStock", "OnionTender", 10),
	minecartPELocomotive("ItemRollingStock", "PELocoIcon", 5),
	minecartPETender("ItemRollingStock", "PETenderIcon", 3),
	minecartGarrattFront("ItemRollingStock", "garrattFrontIcon", 3),
	minecartGarrattMid("ItemRollingStock", "garrattMidIcon", 3),
	minecartGarrattBack("ItemRollingStock", "garrattRearIcon", 3),
	minecartSkook("ItemRollingStock", "skookum", 5),
	minecartSkookTender("ItemRollingStock", "skookum_tender", 4),
	minecartShay3Truck("ItemRollingStock", "3TruckShay", 5),
	minecartShay3TruckTender("ItemRollingStock", "3TruckShayTender", 4),
	//minecartSteamCrane("ItemRollingStock", "GarrattMidIcon", 3),

	minecartLocoRenfe446Motor("ItemRollingStock", "446_motor_icon", 3),
	minecartPassengerRenfe446Coach("ItemRollingStock", "446_middle_icon", 3),
	minecartCabooseRenfe446Tail("ItemRollingStock", "446_tail_icon", 3),
	minecartPCH120Commute("ItemRollingStock", "pch120", 4),
	minecartPCH120Car("ItemRollingStock", "pch120car", 3),
	minecartPS52seatCoach("ItemRollingStock", "PS52seatCoach", 3),
	minecartPScombine("ItemRollingStock", "PScombine", 3),
	minecartPSCenterDiner("ItemRollingStock", "PScenterDiner", 3),
	minecartPSAnotherDiner("ItemRollingStock", "BAP_Pullman_Standard_lightweight_center_diner_icom", 3),
	minecartDstockEngine("ItemRollingStock","DstockEngine", 4),
	minecartDstockCar("ItemRollingStock","DstockCar", 3),
	minecartLUengine("ItemRollingStock","luengine", 4),
	minecartLUcar("ItemRollingStock","lupassenger", 3),
	minecartClass345engine("ItemRollingStock", "Class345Engine", 4),
	minecartClass345car("ItemRollingStock", "Class345Coach", 3),
	minecartLocoRenfe450Motor("ItemRollingStock", "450_front_icon", 3),
	minecartPassengerRenfe450Coach("ItemRollingStock", "450_middle_icon", 3),
	minecartCabooseRenfe450Tail("ItemRollingStock", "450_tail_icon", 3),
	minecartCD010("ItemRollingStock", "CD010", 2),
	minecartCD810("ItemRollingStock", "CD810", 2),
	minecartCD014("ItemRollingStock", "CD014", 2),// bruh
	minecartCD814("ItemRollingStock", "CD814", 2),
	minecartCD914("ItemRollingStock", "CD914", 2),
	minecartAmfleet("ItemRollingStock", "Amfleet", 3),
	minecartAmfleet2("ItemRollingStock", "Amfleet2", 3),
	minecartPEcooch("ItemRollingStock", "pecoach", 6),
	minecartPEobserve("ItemRollingStock", "peobserve", 6),
	minecartStarCarFat("ItemRollingStock", "GWRClosed_Icon", 3),
	minecartStarCarNotFat("ItemRollingStock", "GWROpen_Icon", 3),
	minecart440RFront("ItemRollingStock", "440R_end_icon", 3),
	minecart440RMid("ItemRollingStock", "440R_middle_icon", 3),
	minecart440RRear("ItemRollingStock", "440R_tail_icon", 3),
	minecart3300Front("ItemRollingStock", "3300_engine_icon", 3),
	minecart3300Rear("ItemRollingStock", "3300_tail_icon", 3),
	minecartPS73Baggage("ItemRollingStock", "PS_73_baggage_icon", 3),
	minecartPS85Baggage("ItemRollingStock", "PS_85_baggage_icon", 3),
	minecartClass158engine("ItemRollingStock", "Class_158_Icon", 4),
	minecartClass158car("ItemRollingStock", "Class_158_Middle_Icon", 3),
	minecartClass47("ItemRollingStock", "Class_47_Icon", 3),
	minecartClass156engine("ItemRollingStock", "Class_156_Icon", 3),
	minecartClass153engine("ItemRollingStock", "153_icon", 3),
	minecartClass153Coach("ItemRollingStock", "153_icon", 3),
	minecartClass175("ItemRollingStock", "Class_175_Icon", 3),
	minecartClass175Coach("ItemRollingStock", "Class_175_Middle_Car_Icon", 3),
	minecartPSSleeper565("ItemRollingStock", "BAP_PS_lightweight_5-6-5_sleeper_icon", 3),
	minecartPSSleeper565DRGW("ItemRollingStock", "BAP_PS_lightweight_DRGW_5-6-5_sleeper_icon", 3),

	minecartBR155("ItemRollingStock", "Db_155_icon", 4),
	minecartDB143("ItemRollingStock", "143_icon", 4),
	minecartEF1("ItemRollingStock", "ef1", 6),
	minecartEF1B("ItemRollingStock", "ef1b", 5),
	minecartEP1A("ItemRollingStock", "ep1a", 6),
	minecartILMA("ItemRollingStock", "I.L.MA_icon", 2),
	minecartILMB("ItemRollingStock", "I.L.M.B", 2),
	//minecartBoxMotor("ItemRollingStock", "BoxMotor", 4),
	minecartEU07("ItemRollingStock", "EU07Icon", 2),
	minecartGM6C("ItemRollingStock", "GM6C_Icon", 5),

	minecartRoundHopper("ItemRollingStock", "train_RoundHopper", 2),
	minecartRibbedHopper("ItemRollingStock", "train_ribbed_hopper", 2),
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
	//minecartOWO60Verticube("ItemRollingStock", "owocube", 6),
	minecartVersaLongi("ItemRollingStock", "versalongi", 5),
	minecartVersaTrans("ItemRollingStock", "versatrans", 5),
	minecart11000DOT111("ItemRollingStock", "11000DOT", 4),
	minecart20600DOT111("ItemRollingStock", "20600DOT", 5),
	minecart29080DOT111("ItemRollingStock", "29080DOT", 6),
	minecartLightCrane("ItemRollingStock", "LightCrane_Icon", 3),
	//minecartWWCP40FootBox("ItemRollingStock", "40fticon", 3),
	//minecartHuskyStackWellcar("ItemRollingStock", "huskystack", 5),
	minecarthicube60foot("ItemRollingStock", "hicube60", 5),
	minecartBNSFGon("ItemRollingStock", "BNSFGondola", 3),
	minecartHopper5201("ItemRollingStock", "Hopper5201", 4),
	minecartHopper6260("ItemRollingStock", "Hopper6260", 5),
	minecartSkeletonLogCar("ItemRollingStock", "Skeleton", 1),
	minecartReefer64("ItemRollingStock", "Reefer64", 5),

	minecartWVcaboose("ItemRollingStock", "wvcaboose",3),
	//minecartHBC1Ccaboose("ItemRollingStock", "HBC1C",3),
	minecartDRGWCaboose("ItemRollingStock", "DRGW_01400_series_caboose",3),
	minecartAlcoPA1("ItemRollingStock", "AlcoPA1Icon",5),
	minecartAlcoPB1("ItemRollingStock", "AlcoPB1Icon",4),
	minecartEMDE8A("ItemRollingStock", "EMDE8AIcon",5),
	minecartEMDE8B("ItemRollingStock", "EMDE8BIcon",5),
	minecartSNCB_M6_TAIL("ItemRollingStock", "SNCB_M6_Tail_Icon", 5),
	minecartSNCB_M6("ItemRollingStock", "SNCB_M6_Coach_Icon", 5),
	minecartNMBS_HLE_18("ItemRollingStock", "NMBS_HLE_18", 5),
	minecartClass319Engine("ItemRollingStock", "Class319Engine", 5),
	minecartClass319passenger("ItemRollingStock", "Class319Middle", 5),
	minecartClass319panto("ItemRollingStock", "Class319Panto", 5),
	minecartClass319Tail("ItemRollingStock", "Class319Tail", 5),
	minecartPSRPOPM("ItemRollingStock", "PSRPOPMIcon", 3),
	minecartPSRPO("ItemRollingStock", "PSRPOIcon", 3),
	minecartPassengerMinetrain("ItemRollingStock","train_mine_cart", 1),
	minecartBNLRV_B("ItemRollingStock", "BNLRV_B", 1 ),
	minecartBNLRV_A("ItemRollingStock", "BNLRV_A", 1 ),
	//minecartasteri("ItemRollingStock", "asteri",1),
	minecartBR_Black_5("ItemRollingStock", "BR_Black_5", 5),
	minecartBR_Black_5_Tender("ItemRollingStock", "BR_Black_5_Tender", 1),
	minecartC415H("ItemRollingStock", "c415h", 4),
	minecartC415S("ItemRollingStock", "c415s", 4),
	minecartC415L("ItemRollingStock", "c415l", 4),
	minecart25Ton("ItemRollingStock", "25-tonner_icon", 2),
	minecartGSI60FootBulkhead("ItemRollingStock", "gsi_bulky", 4),
	minecartGSC60FootFlatcar("ItemRollingStock", "gsc_flatass", 3),
	minecartH24_66("ItemRollingStock", "FM_H24-66_icon", 5),
	minecartH24_66L("ItemRollingStock", "FM_H24-66_L_icon", 5),
	minecartPSLunchCounter_Lounge("ItemRollingStock", "PSLunchCounter_Lounge", 3),
	minecartPS30SeatParlor("ItemRollingStock", "PS30SeatParlor", 3),
	minecartPS54SeatCoach_Lounge("ItemRollingStock", "PS54SeatCoach_Lounge", 3),
	minecartPS58SeatCoach_Observation("ItemRollingStock", "PS58SeatCoach_Observation", 3),
	minecartPSBM56SeatCoach("ItemRollingStock", "PSBM56SeatCoach", 3),
	minecartPSBMCombine("ItemRollingStock", "PSBMCombine", 3),
	minecartPSBMDiner_Lounge("ItemRollingStock", "PSBMDiner_Lounge", 3),
	minecartEMDE7A("ItemRollingStock", "EMDE7AIcon",5),
	minecartEMDE7B("ItemRollingStock", "EMDE7BIcon",5),
	minecart5Plank("ItemRollingStock", "5 plank icon", 5),
	minecartH16_66("ItemRollingStock", "FM_H16-66_icon", 5),
	minecartACFGNRPO_30("ItemRollingStock", "ACFGNRPO_30", 3),
	minecartACFGN60SeatCoach("ItemRollingStock", "ACFGN60SeatCoach", 3),
	minecartFGV4300Motor("ItemRollingStock","FGV4300", 5 ),
	minecartFGV4300Coach("ItemRollingStock", "FGV4300Coach", 5),
	minecartFGV4300Tail("ItemRollingStock","FGV4300Tail",5),
	minecartMetro3000Loco("ItemRollingStock","MM3000_Motor_icon",4),
	minecartMetro3000Passenger("ItemRollingStock","MM3000_Middle_icon",4),
	minecartMetro3000Tail("ItemRollingStock","MM3000_Tail_icon",4),
	minecartcq310Loco("ItemRollingStock","CQ_310_Loco_icon",3),
	minecartcq310Tail("ItemRollingStock","CQ_310_Tail_icon",2),
	minecartClass162Engine("ItemRollingStock","Class_162_Engine_icon",2),
	minecartClass162CoachB("ItemRollingStock","Class_162_Coach_B_icon",1),
	minecartClass162CoachA("ItemRollingStock","Class_162_Coach_A_icon",1),
	minecartClass162Tail("ItemRollingStock", "class_162_tail_icon", 1),
	minecartClass34("ItemRollingStock", "class_34_icon", 4),
	minecartTanker_UK("ItemRollingStock", "Tanker_UK_icon", 1),
	minecartMetalTram("ItemRollingStock", "Metal_Tram_icon", 2),
	minecartMetalTramCoach("ItemRollingStock", "Metal_Tram_Coach_icon", 1),
	minecartRWType3("ItemRollingStock", "RW_Type_3_icon",3),
	minecartRWType2("ItemRollingStock", "Type_2_Loco_Icon",3),
	minecartRWType2Tender("ItemRollingStock", "Type_2_Tender_Icon", 1),
	minecartHopper_UK("ItemRollingStock", "Hopper_UK_icon", 1),
	minecartGWR42xx("ItemRollingStock", "2-8-0_icon",3),
	minecartGWR72xx("ItemRollingStock", "72xx_icon",3),
	minecartGWR101Class("ItemRollingStock", "GWR_101_icon",2),
	minecartB80C_A("ItemRollingStock", "B80C_A_icon",2),
	minecartB80C_B("ItemRollingStock", "B80C_B_icon",1),
	minecartWoodenTramCoach("ItemRollingStock", "Wooden_Tram_Coach_icon",1),
	minecartMA100_Loco("ItemRollingStock", "MA100_Loco_icon",2),
	minecartMA100_Tail("ItemRollingStock", "MA100_Tail_icon",1),
	minecartExpressFreightVan("ItemRollingStock", "Express_Freight_Van_icon",1),
	minecartWWCPClass062T("ItemRollingStock", "WWCP_Standard_0-6-2_Icon",2),
	minecartBRBritanniaClass("ItemRollingStock", "BR_Britannia_Icon",5),
	minecartBR1Tender("ItemRollingStock", "BR1_Tender_Icon", 1),
	minecartClass390Front("ItemRollingStock", "Class_390_Front_Icon", 4),
	minecartClass390Coach("ItemRollingStock", "Class_390_Coach_Icon", 2),
	minecartClass390Panto("ItemRollingStock", "Class_390_Panto_Icon", 2),
	minecartClass121Bubblecar("ItemRollingStock", "Icon_121", 3),
	minecartClass121Trailer("ItemRollingStock", "Icon_121_Trailer", 1),
	minecartClass117("ItemRollingStock", "Icon_117", 3),
	minecartClass117Middle("ItemRollingStock", "Icon_117_Middle", 1),
	minecartTipperUK("ItemRollingStock", "tipper_icon",1),
	minecartShuntingTenderUK("ItemRollingStock", "shunting_tender_icon",1),
	minecartBR_Mk2f_DBSO("ItemRollingStock", "Mk2f_DBSO_Icon", 3),
	minecartBRBrakeVan("ItemRollingStock", "br_brake_van_icon",1),
	minecartDuewagT4ER("ItemRollingStock","Duewag_T4ER_icon",3),
	minecartDuewagGT6ZRLoco("ItemRollingStock","Duewag_GT6_Loco_icon",2),
	minecartDuewagGT6ZRTail("ItemRollingStock","Duewag_GT6_Tail_icon",2),
	minecartM8CLoco("ItemRollingStock","M8C_Loco_icon",2),
	minecartM8CTail("ItemRollingStock","M8C_Tail_icon",2),
	minecartClass416Locomotive("ItemRollingStock", "Class_416_engine_icon", 1),
	minecartClass416Tail("ItemRollingStock", "Class_416_tail_icon", 1),
	minecartDB420Loco("ItemRollingStock","db420_Loco_icon",1),
	minecartDB420Middle("ItemRollingStock","db420_Middle_icon",1),
	minecartDB420Tail("ItemRollingStock","db420_Tail_icon",1),
	minecartCattleVan("ItemRollingStock","cattle_van_icon",1),
	minecartClass401Loco("ItemRollingStock", "2-bil_icon", 1),
	minecartClass401Tail("ItemRollingStock", "2-bil_tail_icon", 1),
	minecartTENtonBrakeVan("ItemRollingStock", "10ton_brakevan_icon", 1),
	minecartClass230Engine("ItemRollingStock","Class_230_Icon", 4),
	minecartClass230Middle("ItemRollingStock","Class_230_Middle_Icon", 1),
	minecartDuewagGT6ERLoco("ItemRollingStock","Duewag_GT6ER_Loco_icon",2),
	minecartDuewagGT6ERTail("ItemRollingStock","Duewag_GT6ER_Tail_icon",2),
	minecartMineralwagon("ItemRollingStock", "Mineral_wagon_Icon", 4),
	minecartJ50("ItemRollingStock", "J50_icon", 5),
	minecartVentilatedVan("ItemRollingStock", "Ventilated_van_Icon", 3),
	minecartSentinelY3("ItemRollingStock", "Sentinel_Y3_icon", 4),
	minecartClass143Front("ItemRollingStock", "Class143_icon", 5),
	minecartClass143Rear("ItemRollingStock", "Class143_icon", 3),
	minecartClass143Middle("ItemRollingStock", "Class144_icon", 2),
	minecartClass374Front("ItemRollingStock", "Class_374_Front_Icon", 5),
	minecartClass374PremierPanto("ItemRollingStock", "Class_374_PremierPanto_Icon", 2),
	minecartClass374StandardPanto("ItemRollingStock", "Class_374_StandardPanto_Icon", 2),
	minecartClass374Buffet("ItemRollingStock", "Class_374_Buffet_Icon", 2),
	minecartClass387Front("ItemRollingStock", "Class_387_Front_Icon", 4),
	minecartClass387Coach("ItemRollingStock", "Class_387_Coach_Icon", 2),
	minecartClass387Panto("ItemRollingStock", "Class_387_Panto_Icon", 2),
	minecartClass387Tail("ItemRollingStock", "Class_387_Tail_Icon", 2),
	minecartClass378Front("ItemRollingStock", "Class_378_Front_Icon", 5),
	minecartClass378Middle("ItemRollingStock", "Class_378_Middle_Icon", 2),
	minecartClass378Tail("ItemRollingStock", "Class_378_Tail_Icon", 2),
	minecartJacknail("ItemRollingStock", "0-8-0_box_tank_icon", 5),
	minecartMRcompound("ItemRollingStock", "Icon_midland_compound", 4),
	minecartMRcompoundTender("ItemRollingStock", "Icon_midland_compound_tender", 2),
	minecartClass142Front("ItemRollingStock", "Class_142_Icon", 4),
	minecartClass142Tail("ItemRollingStock", "Class_142_Tail_Icon", 2),
	minecartBagnall("ItemRollingStock", "Bagnall_Icon", 4),
	minecartClass389Front("ItemRollingStock", "Class_389_Front_Icon", 5),
	minecartClass389Middle("ItemRollingStock", "Class_389_Middle_Icon", 2),
	minecartClass389Tail("ItemRollingStock", "Class_389_Tail_Icon", 2),
	minecartClass442DTS("ItemRollingStock", "Class_442_DTS_Icon", 5),
	minecartClass442TS("ItemRollingStock", "Class_442_TS_Icon", 2),
	minecartClass442MBLS("ItemRollingStock", "Class_442_MBLS_Icon", 2),
	minecartClass205loco("ItemRollingStock", "Class_205_engine_icon", 3),
	minecartCLass205tso("ItemRollingStock", "Class_205_trailer_icon", 2),
	minecartClass205tail("ItemRollingStock", "Class_205_tail_icon", 2),
	minecartM8DNF1Loco("ItemRollingStock", "m8d_nf1_loco_icon", 2),
	minecartM8DNF1Middlelong("ItemRollingStock", "m8d_nf1_middle_icon", 1),
	minecartM8DNF1Middleshort("ItemRollingStock", "m8d_nf1_middle2_icon", 1),
	minecartM8DNF1Tail("ItemRollingStock", "m8d_nf1_tail_icon", 2),
	minecartTenderHeavy("ItemRollingStock", "train_tender_heavy", 5),
	minecartRotativeDigger("ItemRotativeDigger","train_",10),
	minecartIceWagon("ItemRollingStock", "icewagon", 10),
	minecartICE1_Loco("ItemRollingStock", "train_ice1", 10),
	minecartICE1_1stClass("ItemRollingStock", "train_ice1_passenger", 10),
	minecartICE1_2ndClass("ItemRollingStock", "train_ice1_passenger", 10),
	minecartICE1_Restaurant("ItemRollingStock", "train_ice1_restaurant", 10),
















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