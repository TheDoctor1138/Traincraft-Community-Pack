package tcce.common.library;

import tcce.common.entity.rollingStock.diesel.*;
import tcce.common.entity.rollingStock.electric.*;
import tcce.common.entity.rollingStock.steam.*;
import train.common.api.TrainSoundRecord;

public enum TCCEEnumSounds implements TrainSoundRecord {

	locoSteamBR_Britannia_Class(EntityLocoSteamBR_Britannia_Class.class, "BritanniaWhistle", 1F, "BritanniaMediumChuff", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamRWType3(EntityLocoSteamRWType3.class, "RW_type_3", 1.2F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamRWType2(EntityLocoSteamRWType2.class, "type_2", 1.4F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamGWR42xx(EntityLocoSteamGWR42xx.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamGWR72xx(EntityLocoSteamGWR72xx.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamGWR101Class(EntityLocoSteamGWR101Class.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoSteamWWCPClass062T(EntityLocoSteamWWCPClass062T.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	locoElectricBR_MK2F_DBSO(EntityElectricBR_MK2F_DBSO.class, "british_two_tone", 0.8F, "", 0F, 0, "", 0F, 0, false),
	locoElectricBR_MK3_DVT(EntityElectricBR_MK3_DVT.class, "mg_horn", 1F, "", 0F, 0, "", 0F, 0, false),
	locoElectricBR_MK4_DVT(EntityElectricBR_MK4_DVT.class, "mg_horn", 1F, "", 0F, 0, "", 0F, 0, false),
	locoSpeedGrey(EntityLocoElectricNewHighSpeed.class, "high_speed_horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	nmbs_hle_18(EntityLocoElectricNMBS_HLE_18.class, "mg_horn", 1F, "vl10_idle", 0.8F, 10, "vl10_idle", 0.6F, 50, false),
	locoCD754(EntityLocoDieselCD754.class, "742_horn", 0.8F, "742_motor_slow", 0.65F, 40, "742_motor", 0.65F, 40, false),
	lococlass117(EntityLocoDieselClass117.class, "eu07_horn", 1F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	lococlass121(EntityLocoDieselClass121.class, "eu07_horn", 1F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	lococlass158(EntityLocoDieselClass158.class, "Class158Horn", 1.2F, "chme3_idle", 0.7F, 40, "chme3_idle", 0.6F, 40, false),
	lococlass153(EntityLocoDieselClass153.class, "british_two_tone", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	lococlass175(EntityLocoDieselClass175.class, "british_two_tone", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	lococlass156(EntityLocoDieselClass156.class, "british_two_tone", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	locoClass47(EntityLocoDieselClass47.class, "Class47Horn", 1F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),

	DieselClass44(EntityLocoDieselClass44.class, "british_two_tone", 0.8F, "vl10_idle", 0.65F, 40, "vl10_idle", 0.65F, 40, false),
	DieselKOF_III(EntityLocoDieselKof_III.class, "chme3_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	DieselKOF_III_M(EntityLocoDieselKof_III_M.class, "chme3_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	//DieselSM42(EntityLocoDieselSM42.class, "sm42_chime", 0.8F, "sm42_run", 0.65F, 40, "sm42_idle", 0.65F, 40, false),
	// ElectricClass345(EntityElectricClass345.class, "subway_horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	Electric440R(EntityLocoElectric440RFront.class, "446Horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	ElectricBR155(EntityLocoElectricBR155.class, "br155_chime", 1F, "mg_run", 0.6F, 8, "mg_idle", 0.4F, 50, false),
	ElectricDB143(EntityLocoElectricDB143.class, "mg_horn", 1F, "mg_run", 0.6F, 8, "mg_idle", 0.4F, 50, false),
	// ElectricDStockEngine(EntityElectricDstockEngine.class, "dstock_whistle", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	ElectricClass230Engine(EntityElectricClass230.class, "446Horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	ElectricEU07(EntityLocoElectricEU07.class, "mg_horn", 1F, "mg_run", 0.6F, 8, "mg_idle", 0.4F, 50, false),
	ElectricFeve3300(EntityLocoElectricFeve3300.class, "446Horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	ElectricILMA(EntityLocoElectricILMA.class, "subway_horn", 0.8F, "MILW_Notch8", 0.6F, 50, "MILW_Idle", 0.6F, 50, false),
	ElectricILMB(EntityLocoElectricILMB.class, "subway_horn", 0.8F, "MILW_Notch8", 0.6F, 50, "MILW_Idle", 0.6F, 50, false),
	// ElectricLUEngine(EntityElectricLUengine.class, "dstock_whistle", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	// ElectricPCH120(EntityLocoElectricPCH120.class, "446Horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	// ElectricRenfe446Motor(EntityLocoElectricRenfe446Motor.class, "446Horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	//ElectricRenfe450Motor(EntityLocoElectricRenfe450Motor.class, "446Horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	// SteamC11(EntityLocoSteamC11.class, "class62_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	SteamStarClass(EntityLocoSteamStarClass.class, "adler_whistle", 0.8F, "adler_run", 0.2F, 20, "adler_run", 0.2F, 20, true),
	Class43(EntityLocoDieselClass43.class, "HSTHorn", 1.2F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	Class90(EntityElectricClass90.class, "mg_horn", 1F, "Class868790Thrash", 0.8F, 10, "Class90Idle", 0.6F, 50, false),
	Class91(EntityElectricClass91.class, "mg_horn", 1F, "Class868790Thrash", 0.8F, 10, "Class90Idle", 0.6F, 50, false),
	Class321(EntityElectricClass321.class, "mg_horn", 1F, "vl10_idle", 0.8F, 10, "vl10_idle", 0.6F, 50, false),
	Class389Front(EntityElectricClass389Front.class, "british_two_tone", 1F, "vl10_idle", 0.8F, 10, "vl10_idle", 0.6F, 50, false),
	Class387Front(EntityElectricClass387Front.class, "british_two_tone", 1F, "vl10_idle", 0.8F, 10, "vl10_idle", 0.6F, 50, false),
	Class378Front(EntityElectricClass378Front.class, "british_two_tone", 1F, "vl10_idle", 0.8F, 10, "vl10_idle", 0.6F, 50, false),
	Class319Engine(EntityElectricClass319.class, "mg_horn", 1F, "vl10_idle", 0.8F, 10, "vl10_idle", 0.6F, 50, false),
	Class390Front(EntityElectricClass390.class, "PendolinoHorn", 1.4F, "vl10_idle", 0.8F, 10, "vl10_idle", 0.6F, 50, false),
	Class374Front(EntityElectricClass374.class, "mg_horn", 1F, "vl10_idle", 0.8F, 10, "vl10_idle", 0.6F, 50, false),
	Class442DTS(EntityElectricClass442DTS.class, "british_two_tone", 1F, "vl10_idle", 0.8F, 10, "vl10_idle", 0.6F, 50, false),
	asteri(EntityLocoSteamasteri.class, "asteri", 1F, "asteri", 0.2F, 212, "mg_idle", 0.6F, 50, false),
	FGV4300(EntityLocoElectricFGV4300.class, "4300_horn", 1F, "vl10_idle", 0.65F, 10, "vl10_idle", 0.6F, 40, false),
	Class162Engine(EntityElectricClass162.class, "mg_horn", 1F, "vl10_idle", 0.8F, 10, "vl10_idle", 0.6F, 50, false),
	Class34(EntityLocoDieselClass34.class, "british_two_tone", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	// TW305(EntityLocoElectricTW305.class, "tram_bell", 1F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	MetalTram(EntityLocoElectricMetalTram.class, "tram_bell", 1F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	KVB_2300(EntityElectricKVB_2300.class, "tram_bell", 1F, "mg_run", 0.6F, 50, "mg_run", 0.6F, 50, false),
	MA100(EntityElectricMA100_Loco.class, "4300_horn", 1F, "mg_run", 0.6F, 50, "mg_run", 0.6F, 50, false),
	B80C_A(EntityElectricB80C_A.class, "tram_bell", 1F, "mg_run", 0.6F, 50, "mg_run", 0.6F, 50, false),
	CQ310(EntityElectricCQ310Loco.class, "subway_horn", 1F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	DuewagT4ER(EntityElectricDuewagT4ER.class, "tram_bell", 1F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	DuewagGT6ZRLoco(EntityElectricDuewagGT6ZRLoco.class, "tram_bell", 1F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	M8CLoco(EntityElectricM8CLoco.class, "tram_bell", 1F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	Class416Loco(EntityElectricClass416Loco.class, "british_two_tone", 1F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, true),
	DB420Loco(EntityElectricDB420Loco.class, "mg_horn", 1F, "mg_run", 0.6F, 8, "mg_idle", 0.4F, 50, false),
	Class401Loco(EntityLocoElectricClass401.class, "mg_horn", 1F, "mg_run", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	DuewagGT6ERLoco(EntityElectricDuewagGT6ERLoco.class, "tram_bell", 1F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),
	J50loco(EntityLocoSteamJ50.class, "a4_whistle", 1.25f, "steam_run", 0.5f, 25, "adler_run", 1f, 40, true),
	SentinelY3(EntityLocoSteamSentinelY3.class, "adler_whistle", 1f, "steam_run", 0.75f, 10, "steam_run", 0.25f, 20, true),
	Class142Front(EntityLocoDieselClass142.class, "british_two_tone", 1f, "chme3_idle", 0.75f, 10, "chme3_idle", 0.5f, 20, false),
	Class143Front(EntityLocoDieselClass143.class, "british_two_tone", 1f, "FM_38D_6_Notch8", 0.6f, 10, "chme3_idle", 0.5f, 20, false),
	Jacknail(EntitylocoSteamJacknail.class, "american_steam_horn", 1.5f, "steam_run", 0.6f, 25, "adler_run", 0.5f, 17, true),
	MRcompound(EntitylocoSteamMRCompound.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true),
	Bagnall(EntityLocoDieselBagnall.class, "v60_horn", 1f, "chme3_idle", 0.8f, 10, "chme3_idle", 0.5f, 20, false),
	Class205(EntityLocoDieselClass205loco.class, "eu07_horn", 1F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false),
	M8DNF1Loco(EntityElectricM8DNF1Loco.class, "tram_bell", 1F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false),

	//American Stuff
	Diesel3GS21B(EntityLocoDieselBapNRE3gs21b.class, "nathan_k3ha", 2.5F, "QSK19C_Notch8", 0.65F, 40, "QSK19C_Idle", 0.65F, 50, true),
	DieselB23(EntityLocoDieselBapB23.class, "nathan_m3h", 2.5F, "GE_7FDL_12_Notch8", 0.65F, 40, "GE_7FDL_12_Idle", 0.65F, 50, true),
	DieselCF7Bap(EntityLocoDieselBapCF7.class, "nathan_k3la_4", 0.65F, "EMD_16_567BC_Notch8", 0.65F, 10, "EMD_16_567BC_Idle", 0.8F, 3, true),
	// DieselCF7(EntityLocoDieselCF7.class, "nathan_k3la", 0.65F, "EMD_16_567BC_Notch8", 0.65F, 10, "EMD_16_567BC_Idle", 0.8F, 3, true),
	DieselCF7Round(EntityLocoDieselBapCF7round.class, "leslie_s3lr", 0.65F, "EMD_16_567BC_Notch8", 0.65F, 10, "EMD_16_567BC_Idle", 0.8F, 3, true),
	DieselC424(EntityLocoDieselBapC424.class, "leslie_s3", 2.5F, "ALCO_16_251C_Notch8", 0.5F, 20, "ALCO_16_251C_Idle", 0.5F, 20, false),
	DieselC425(EntityLocoDieselBapC425.class, "leslie_s3l", 2.5F, "ALCO_16_251C_Notch8", 0.5F, 20, "ALCO_16_251C_Idle", 0.5F, 20, false),
	DieselDash840B(EntityLocoDieselBapDash840B.class, "nathan_k3la_4", 2.5F, "GE_7FDL_16_Notch8", 0.65F, 40, "GE_7FDL_16_Idle", 0.65F, 50, true),
	DieselDash840BB(EntityLocoDieselBapDash840BB.class, "Silence", 2.5F, "GE_7FDL_16_Notch8", 0.65F, 40, "GE_7FDL_16_Idle", 0.65F, 50, true),
	DieselDash840BW(EntityLocoDieselBapDash840BW.class, "leslie_s3lr", 2.5F, "GE_7FDL_16_Notch8", 0.65F, 40, "GE_7FDL_16_Idle", 0.65F, 50, true),
	DieselDash840C(EntityLocoDieselBapDash840C.class, "nathan_k5La", 2.5F, "GE_7FDL_16_Notch8", 0.65F, 40, "GE_7FDL_16_Idle", 0.65F, 50, true),
	DieselDash9C44W(EntityLocoDieselBapDash9_44CW.class, "nathan_k3la_4", 2.5F, "GE_7FDL_16_Notch8", 0.65F, 40, "GE_7FDL_16_Idle", 0.65F, 50, true),
	DieselDH643(EntityLocoDieselBapDH643.class, "nathan_p3_2", 2.5F, "ALCO_12_251C_Notch8", 0.5F, 20, "ALCO_12_251C_Idle", 0.5F, 20, false),
	DieselES44(EntityLocoDieselBapES44.class, "nathan_k5hll", 1F, "GE_GEVO_12_Notch8", 0.65F, 20, "GE_GEVO_12_Idle", 0.75F, 50, true),
	DieselF7A(EntityLocoDieselBapF7A.class, "leslie_a200_2", 1F, "EMD_16_567B_Notch8", 0.45F, 15, "EMD_16_567B_Idle", 0.75F, 3, true),
	DieselF7B(EntityLocoDieselBapF7B.class, "Silence", 1F, "EMD_16_567B_Notch8", 0.45F, 15, "EMD_16_567B_Idle", 0.75F, 3, true),
	DieselGP7(EntityLocoDieselBapGP7.class, "nathan_m5", 1F, "EMD_16_567B_Notch8", 0.9F, 8, "EMD_16_567B_Idle", 0.7F, 50, false),
	DieselGP7wccp(EntityLocoDieselWWCPGP7.class, "gp40_2_horn", 1F, "EMD_16_567B_Notch8", 0.9F, 8, "EMD_16_567B_Idle", 0.7F, 50, false),
	DieselGP7b(EntityLocoDieselBapGP7b.class, "leslie_a200", 1F, "EMD_16_567B_Notch8", 0.9F, 8, "EMD_16_567B_Idle", 0.7F, 50, false),
	DieselGP7u(EntityLocoDieselBapGP7u.class, "nathan_k3la_2", 1F, "EMD_16_567B_Notch8", 0.9F, 8, "EMD_16_567B_Idle", 0.7F, 50, false),
	DieselGP9(EntityLocoDieselBapGP9.class, "nathan_p5", 1F, "EMD_16_567C_Notch8", 0.9F, 8, "EMD_16_567C_Idle", 0.7F, 50, false),
	DieselGP13(EntityLocoDieselGP13.class, "nathan_p6", 0.8F, "EMD_16_645E3_Notch8", 0.65F, 35, "EMD_16_645E3_Idle", 0.65F, 40, false),
	// DieselGP15(EntityLocoDieselGP15.class, "nathan_k3ha", 2.5F, "EMD_12_645E_Notch8", 1F, 8, "EMD_12_645E_Idle", 1F, 50, false),
	DieselGP15Bap(EntityLocoDieselBapGP15.class, "nathan_k3la", 2.5F, "EMD_12_645E_Notch8", 1F, 8, "EMD_12_645E_Idle", 1F, 50, false),
	DieselGP30(EntityLocoDieselBapGP30.class, "nathan_p5", 0.8F, "EMD_16_567D3_Notch8", 0.65F, 35, "EMD_16_567D3_Idle", 0.65F, 40, false),
	DieselGP38dash2(EntityLocoDieselBapGP38dash2.class, "nathan_k3la_3", 0.8F, "EMD_16_645E_Notch8", 0.65F, 35, "EMD_16_645E_Idle", 0.65F, 40, false),
	DieselGP38dash9W(EntityLocoDieselBapGP38dash9W.class, "nathan_k5la_5", 0.8F, "EMD_16_645E_Notch8", 0.65F, 35, "EMD_16_645E_Idle", 0.65F, 40, false),
	DieselGP49(EntityLocoDieselBapGP49.class, "nathan_p3_3", 2.5F, "EMD_12_645E3_Notch8", 1F, 8, "EMD_12_645E3_Idle", 1F, 50, false),
	DieselGE44Ton(EntityLocoDieselGE44Ton.class, "leslie_a125", 1.0F, "CAT_8_D17000_Notch8", 0.65F, 40, "CAT_8_D17000_Idle", 0.65F, 40, false),
	DieselHH600(EntityLocoDieselBapHH660.class, "leslie_a200", 2.5F, "ALCO_6_531_Notch8", 0.7F, 40, "ALCO_6_531_Notch8", 0.7F, 60, false),
	DieselH1044(EntityLocoDieselBapH1044.class, "wabco_e2", 10F, "FM_38D_6_Notch8", 0.65F, 40, "FM_38D_6_Notch8", 0.45F, 40, false),
	DieselML4000(EntityLocoDieselBapKrautt.class, "nathan_p3_2", 2.5F, "Maybach_MD870_16_Notch8", 0.7F, 40, "Maybach_MD870_16_Idle", 0.7F, 60, false),
	DieselRSD15(EntityLocoDieselBapRSD15.class, "leslie_rs5t", 1F, "ALCO_16_251C_Notch8", 0.50F, 40, "ALCO_16_251C_Idle", 0.65F, 40, true),
	DieselS2(EntityLocoDieselBapAlcoS2.class, "leslie_a200", 1F, "ALCO_6_539T_Notch8", 0.50F, 40, "ALCO_6_539T_Idle", 0.65F, 40, true),
	DieselSD9(EntityLocoDieselBapSD9.class, "nathan_m3", 1F, "EMD_16_567C_Notch8", 0.9F, 8, "EMD_16_567C_Idle", 0.7F, 50, false),
	DieselSD40Dash2Bap(EntityLocoDieselBapSD40dash2.class, "leslie_rs3k_2", 2.5F, "EMD_16_645E3_Notch8", 0.65F, 10, "EMD_16_645E3_Idle", 0.8F, 5, true),
	DieselSD70M(EntityLocoDieselBapSD70Mac.class, "nathan_k5la_4", 2F, "EMD_16_710G3B_Notch8", 0.5F, 40, "EMD_16_710G3B_Idle", 0.5F, 20, false),
	DieselSWBLW(EntityLocoDieselBapBeep.class, "leslie_s3lr", 2.5F, "EMD_16_567BC_Idle", 0.7F, 40, "EMD_16_567BC_Notch8", 0.7F, 60, false),
	DieselSW1(EntityLocoDieselBapSW1.class, "leslie_a200", 0.9F, "EMD_6_567A_Notch8", 0.45F, 40, "EMD_6_567A_Idle", 0.75F, 40, false),
	//DieselSW8(EntityLocoDieselSW8.class, "leslie_a200", 0.9F, "EMD_8_567C_Notch8", 0.45F, 40, "EMD_8_567C_Idle", 0.75F, 40, false),
	DieselSW1200(EntityLocoDieselBapSW1200.class, "nathan_p2", 0.65F, "EMD_12_567C_Notch8", 0.65F, 10, "EMD_12_567C_Idle", 0.8F, 3, true),
	DieselSW1500(EntityLocoDieselBapSW1500.class, "nathan_p3", 0.65F, "EMD_12_645E_Notch8", 0.65F, 10, "EMD_12_645E_Idle", 0.8F, 3, true),
	DieselU18B(EntityLocoDieselBapU18B.class, "leslie_s3", 2.5F, "GE_7FDL_8_Notch8", 0.65F, 40, "GE_7FDL_8_Idle", 0.65F, 50, true),
	DieselU23B(EntityLocoDieselBapU23B.class, "leslie_s3l", 2.5F, "GE_7FDL_12_Notch8", 0.65F, 40, "GE_7FDL_12_Idle", 0.65F, 50, true),
	DieselU36C(EntityLocoDieselBapU36C.class, "leslie_s3lr", 2.5F, "GE_FDL16_Notch8", 0.5F, 10, "GE_FDL16_Idle", 0.5F, 3, true),
	ElectricGM6C(EntityLocoElectricBapGM6C.class, "nathan_p01235", 2.5F, "MILW_Notch8", 0.65F, 40, "MILW_Idle", 0.65F, 50, true),
	ElectricEF1(EntityLocoElectricBapEF1.class, "wabco_e2", 2.5F, "MILW_Notch8", 0.65F, 40, "MILW_Idle", 0.65F, 50, true),
	ElectricEF1B(EntityLocoElectricBapEF1B.class, "Silence", 0, "MILW_Notch8", 0.65F, 40, "MILW_Idle", 0.65F, 50, true),
	ElectricEP1A(EntityLocoElectricBapEP1A.class, "wabco_e2", 2.5F, "MILW_Notch8", 0.65F, 40, "MILW_Idle", 0.65F, 50, true),
	// SteamClimax(EntityLocoSteamClimaxNew.class, "lukenhimer_3chime", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	SteamOnion(EntityLocoOnion.class, "hancock_3chime", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	SteamPE(EntityLocoSteamPELoco.class, "pe_chime", 0.8F, "pe_run", 0.2F, 20, "pe_idle", 0.2F, 20, true),
	//SteamVBShay(EntityLocoSteamVBShay2.class, "crosby_3chime", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	SteamSkookum(EntityLocoSteamSkook.class, "skookum_whistle", 1F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	SteamShay3Truck(EntityLocoSteamShay3Truck.class, "lukenhimer_3chime", 1F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true),
	DieselEMDE8A(EntityLocoDieselEMDE8A.class, "leslie_a200_2", 1F, "EMD_12_567B_Notch8", 0.45F, 15, "EMD_16_567B_Idle", 0.75F, 3, true),
	DieselEMDE8B(EntityLocoDieselEMDE8B.class, "leslie_a200_2", 1F, "EMD_12_567B_Notch8", 0.45F, 15, "EMD_16_567B_Idle", 0.75F, 3, true),
	DieselAlcoPA1(EntityLocoDieselAlcoPA1.class, "leslie_a200_2", 1F, "ALCO_16_244_Notch8", 0.25F, 40, "ALCO_16_244_Idle", 0.4F, 40, true),
	DieselAlcoPB1(EntityLocoDieselAlcoPB1.class, "wabco_e2", 2.5F, "ALCO_16_244_Notch8", 0.25F, 40, "ALCO_16_244_Idle", 0.4F, 40, true),
	DieselC415H(EntityLocoDieselC415H.class, "nathan_p14r2", 0.65F, "ALCO_8_251F_Notch8", 0.65F, 10, "ALCO_8_251F_Idle", 0.8F, 3, true),
	DieselC415L(EntityLocoDieselC415L.class, "leslie_s3lr", 0.65F, "ALCO_8_251F_Notch8", 0.65F, 10, "ALCO_8_251F_Idle", 0.8F, 3, true),
	DieselC415S(EntityLocoDieselC415S.class, "leslie_s3lr", 0.65F, "ALCO_8_251F_Notch8", 0.65F, 10, "ALCO_8_251F_Idle", 0.8F, 3, true),
	DieselFMH24_66(EntityLocoDieselFMH24_66.class, "leslie_a200_2", 1F, "FM_38D_6_Notch8", 0.65F, 40, "FM_38D_6_Notch8", 0.45F, 40, false),
	DieselFMH24_66L(EntityLocoDieselFMH24_66L.class, "leslie_a200_2", 1F, "FM_38D_6_Notch8", 0.65F, 40, "FM_38D_6_Notch8", 0.45F, 40, false),
	DieselEMDE7A(EntityLocoDieselEMDE7A.class, "leslie_a200_2", 1F, "EMD_12_567B_Notch8", 0.45F, 15, "EMD_16_567B_Idle", 0.75F, 3, true),
	DieselEMDE7B(EntityLocoDieselEMDE7B.class, "leslie_a200_2", 1F, "EMD_12_567B_Notch8", 0.45F, 15, "EMD_16_567B_Idle", 0.75F, 3, true),
	DieselFMH16_66(EntityLocoDieselFMH16_66.class, "leslie_a200_2", 1F, "FM_38D_6_Notch8", 0.65F, 40, "FM_38D_6_Notch8", 0.45F, 40, false),


	;

	private Class entityClass;
	private String horn;
	private float hornVolume;
	private String run;
	private String idle;
	private float runVolume;
	private float idleVolume;
	private int runSoundLenght;
	private int idleSoundLenght;
	private boolean soundChangeWithSpeed;

	/**
	 * Defines the sounds for the locomotives Many locomotives have the same sound for run and idle
	 * 
	 * @param entityClass
	 * @param horn
	 * @param hornVolume
	 * @param run
	 * @param runVolume
	 * @param runSoundLenght
	 * @param idle
	 * @param idleVolume
	 * @param idleSoundLenght
	 * @param soundChangeWithSpeed
	 */
	private TCCEEnumSounds(Class entityClass, String horn, float hornVolume, String run, float runVolume, int runSoundLenght, String idle, float idleVolume, int idleSoundLenght, boolean soundChangeWithSpeed) {
		this.entityClass = entityClass;
		this.horn = horn;
		this.hornVolume = hornVolume;
		this.run = run;
		this.idle = idle;
		this.runVolume = runVolume;
		this.idleVolume = idleVolume;
		this.runSoundLenght = runSoundLenght;
		this.idleSoundLenght = idleSoundLenght;
		this.soundChangeWithSpeed = soundChangeWithSpeed;
	}

    @Override
	public Class getEntityClass() {
		return entityClass;
	}

    @Override
	public String getHornString() {
        if (horn == null || horn.isEmpty() || horn.startsWith(TCCEInfo.resourceLocation + ":")) return horn;
		return TCCEInfo.resourceLocation + ":" + horn;
	}

    @Override
	public String getRunString() {
        if (run == null || run.isEmpty() || run.startsWith(TCCEInfo.resourceLocation + ":")) return run;
		return TCCEInfo.resourceLocation + ":" + run;
	}

    @Override
	public String getIdleString() {
        if (idle == null || idle.isEmpty() || idle.startsWith(TCCEInfo.resourceLocation + ":")) return idle;
		return TCCEInfo.resourceLocation + ":" + idle;
	}

    @Override
	public Float getHornVolume() {
		return hornVolume;
	}

    @Override
	public Float getRunVolume() {
		return runVolume;
	}

    @Override
	public Float getIdleVolume() {
		return idleVolume;
	}

	@Override
	public int getRunSoundLength() {
		return runSoundLenght;
	}

	@Override
	public int getIdleSoundLength() {
		return idleSoundLenght;
	}
    @Override
	public boolean getSoundChangeWithSpeed() {
		return soundChangeWithSpeed;
	}
}
