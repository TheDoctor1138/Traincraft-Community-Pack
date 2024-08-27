package tcce.client.render;


import fexcraft.tmt.slim.ModelBase;
import net.minecraft.util.ResourceLocation;
import tcce.client.render.models.*;
import tcce.common.entity.rollingStock.caboose.*;
import tcce.common.entity.rollingStock.diesel.*;
import tcce.common.entity.rollingStock.electric.*;
import tcce.common.entity.rollingStock.freight.*;
import tcce.common.entity.rollingStock.passenger.*;
import tcce.common.entity.rollingStock.steam.*;
import tcce.common.entity.rollingStock.tender.*;
import tcce.common.library.TCCEInfo;
import train.common.api.EntityRollingStock;
import train.common.api.TrainRenderRecord;

import java.util.ArrayList;

;

public enum TCCERenderEnum implements TrainRenderRecord {

	locoDieselCF7(EntityLocoDieselCF7.class, new ModelCF7(), "CF7_", true, new float[]{-1.5F, 0.15F, 0F}, new float[]{0F, 180F, 180F}, null, "smoke", 6, new ArrayList<double[]>() {
		{
			add(new double[]{0.6D, 1.4D, 0.0D});
			add(new double[]{1.1D, 1.4D, 0.0D});
		}
	}, "", null, 0, false),
	locoDieselGP15(EntityLocoDieselGP15.class, new ModelGP15(), "gp15_", true, new float[]{-1.3F, 0.155F, 0F}, new float[]{0F, 180F, 180F}, null, "smoke", 5, new ArrayList<double[]>() {
		{
			add(new double[]{1.33D, 1.45D, 0.0D});
			add(new double[]{0.75D, 1.45D, 0.0D});
		}
	}, "", null, 0, false),
	LocoDieselSW8(EntityLocoDieselSW8.class, new ModelSW8(), "sw8_", true, new float[]{-1.0F, 0.15F, 0F}, new float[]{0F, 180F, 180F}, null, "smoke", 3, new ArrayList<double[]>() {
		{
			add(new double[]{1.3D, 1.3D, 0.0D});
		}
	}, "", null, 0, false),
	locoElectricRenfe446Motor(EntityLocoElectricRenfe446.class, new Modelrenfe446end(), "446_", true, new float[]{-1.9F, 0.15F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	passengerRenfe446Coach(EntityPassengerRenfe446Coach.class, new Modelrenfe446middle(), "446_", true, new float[]{-0.3F, 0.15F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	cabooseRenfe446Tail(EntityCabooseRenfe446Tail.class, new Modelrenfe446end(), "446_", true, new float[]{0.0F, 0.15F, 0.0F}, new float[]{0F, 0F, 180F}, null, "", 0, null, "", null, 0, false),
	pch120(EntityLocoElectricPCH120.class, new ModelPCH120Commute(), "pch120commute_", true, new float[]{-1.3F, 0.01F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	pch120Coach(EntityPassengerPCH120Coach.class, new ModelPCH120Car(), "pch120car_", true, new float[]{0F, 0.01F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Class345(EntityLocoElectricClass345.class, new ModelClass345(), "Class345_", true, new float[]{-1.5F, 0.17F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Class345Coach(EntityPassengerClass345Coach.class, new ModelClass345Coach(), "Class345_Passenger_", true, new float[]{0F, 0.05F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	LUengine(EntityLocoElectricLU.class, new ModelLUengine(), "LU_96_Stock_", true, new float[]{-3.25F, -0.09F, 0.7F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	LUpassenger(EntityPassengerLU.class, new ModelLUpassenger(), "LU_96_Stock_", true, new float[]{-2.12F, -0.09F, 0.7F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	DstockEngine(EntityLocoElectricDStock.class, new ModelDstockEngine(), "D_stock_engine_", true, new float[]{-1.0F, 0.16F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	DstockCar(EntityPassengerDStock.class, new ModelDstockPassenger(), "D_stock_passenger_", true, new float[]{0F, 0.16F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	passengerPS52SeatCoach(EntityPassengerPS52SeatCoach.class, new ModelPS52SeatCoach(), "PS_lightweight_52seat_", true, new float[]{0F, 0.15F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	passengerPSCombine(EntityPassengerPSCombine.class, new ModelPSCombine(), "PS_lightweight_baggage-coach_", true, new float[]{0F, 0.15F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	passengerPScenterDiner(EntityPassengerPScenterDiner.class, new ModelPScenterDiner(), "PS_lightweight_center_diner_", true, new float[]{0F, 0.15F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	passengerPSAnotherDiner(EntityPassengerPSAnotherDiner.class, new ModelPSscrewyoutoomanydiners(), "PS_lightweight_center_diner_2_", true, new float[]{0F, 0.15F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	locoElectricMetro2000(EntityLocoElectricMetro2000.class, new ModelMetroMadrid2000Loco(), "metro_2000_", true, new float[]{-1.5F, 0.2F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	passengerMetro2000(EntityPassengerMetro2000.class, new ModelMetro2000Tail(), "metro_2000_", true, new float[]{0F, 0.2F, 0.0F}, new float[]{0F, 0F, 180F}, null, "", 0, null, "", null, 0, false),
	locoElectricRenfe450Motor(EntityLocoElectricRenfe450Motor.class, new Modelrenfe450endA(), "450_loco_", true, new float[]{-1.9F, 0.1F, 0.0F}, new float[]{0F, 0F, 180F}, null, "", 0, null, "", null, 0, false),
	passengerRenfe450Coach(EntityPassengerRenfe450Coach.class, new Modelrenfe450middle(), "450_passenger_", true, new float[]{-0.0F, 0.1F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	cabooseRenfe450Tail(EntityCabooseRenfe450Tail.class, new Modelrenfe450endB(), "450_passenger_", true, new float[]{0.0F, 0.1F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	passengerCD014(EntityPassengerCD014.class, new ModelCD014(), "cd014_", true, new float[]{0.0F, 0.15F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	passengerCD914(EntityPassengerCD914.class, new ModelCD914(), "cd914_", true, new float[]{0.0F, 0.15F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	passengerCD010(EntityPassengerCD010.class, new ModelCD010(), "cd010_", true, new float[]{0.0F, 0.15F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	locoCD814(EntityLocoDieselCD814.class, new ModelCD814(), "cd814_", true, new float[]{-0.8F, 0.15F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	locoCD810(EntityLocoDieselCD810.class, new ModelCD810(), "cd810_", true, new float[]{-0.8F, 0.15F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	VBShay(EntityLocoSteamVBShay2.class, new ModelVertiBoi2(), "vbshay2", false, new float[]{-0.4F, -1.15F, -0.0F}, new float[]{0F, 0F, 0F}, null, "largesmoke", 20, new ArrayList<double[]>() {
		{
			add(new double[]{0.6D, 1.9D, -0.1D});
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[]{0.6D, -0.4D, 0.8D});
			add(new double[]{0.3D, 2.3D, 0.0D});
		}
	}, 2, true),
	locoSteamClimax2(EntityLocoSteamClimaxNew.class, new ModelClimaxNew(), "climax_Grey", false, new float[]{-0.4F, -1.15F, -0.0F}, new float[]{0F, 180F, 0F}, null, "largesmoke", 20, new ArrayList<double[]>() {
		{
			add(new double[]{1.55D, 1.6D, 0.0D});
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[]{1.0D, -0.0D, 0.8D});
		}
	}, 2, true),
	freightRoundHopper(EntityFreightRoundHopper.class, new ModelRoundHopper(), "roundedhopper_", true, new float[]{-0F, 0.15F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	freightRibbedHopper(EntityFreightRibbedHopper.class, new ModelRibbedHopper(), "ribbed_hopper_", true, new float[]{-0F, 0.1F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	locoSM42(EntityLocoDieselSM42.class, new SM42(), "SM42_", true, new float[]{-2.0F, 0.05F, 0.0F}, new float[]{0F, 180F, 180F}, null, "smoke", 4, new ArrayList<double[]>() {
		{
			add(new double[]{0.9D, 1.35D, 0.0D});
		}
	}, "", null, 0, false),
	locoDieselWWCPGP7(EntityLocoDieselWWCPGP7.class, new ModelWWCPGP7(), "GP7_Highood_", true, new float[]{-2f, 0.15f, 0}, new float[]{0F, 0F, 180F}, new float[]{0.9f, 1f, 0.9f}, "smoke", 4, new ArrayList<double[]>() {
		{
			add(new double[]{1.7D, 1.3D, 0.0D});

			add(new double[]{0.85D, 1.3D, 0.0D});
		}
	}, "", null, 0, false),
	locoC11(EntityLocoSteamC11.class, new ModellocoC11(), "locoC11", false, new float[]{-1.5F, 0.2F, 0.0F}, new float[]{0, 180, 180}, null, "largesmoke", 5, new ArrayList<double[]>() {
		{
			add(new double[]{3.05D, 1.25D, 0D});
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[]{2.9D, 0.00D, 0.75D});
		}
	}, 3, true),
	LocoDieselGE44Ton(EntityLocoDieselGE44Ton.class, new ModelGE44Ton(), "44_ton_", true, new float[]{-1.0F, 0.15F, 0F}, new float[]{0F, 180F, 180F}, null, "smoke", 3, new ArrayList<double[]>() {
		{
			add(new double[]{0.6D, 1.1D, 0.0D});
			add(new double[]{1.4D, 1.1D, 0.0D});
		}
	}, "", null, 0, false),
	amfleet(EntityPassengerAmfleet.class, new ModelAmfleet(), "amfleet_", true, new float[]{0F, -0.4F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	amfleet2(EntityPassengerAmfleet2.class, new ModelAmfleet2(), "amfleet2_", true, new float[]{0F, -0.4F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	bawx40highcube(EntityFreightBap40highcube.class, new Model40highcube(), "40highcube_", true, new float[]{0F, 0.15F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	WoodchipHopper(EntityFreightBapWoodchipHopper.class, new ModelWoodchipHopper(), "woodchiphopper_", true, new float[]{0F, 0.0F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	OreJenny(EntityFreightBapOreJenny.class, new ModelOreJenny(), "orejenny_", true, new float[]{0F, 0.0F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	MillGondola(EntityFreightBapMillGondola.class, new ModelMillGondola(), "MillGondola_", true, new float[]{0F, 0.0F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	MILW40boxcar(EntityFreightBapMILW40boxcar.class, new ModelMILW40boxcar(), "milw40_", true, new float[]{0F, 0.15F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Freight60centerbeam(EntityFreightBap60centerbeam.class, new Model60centerbeam(), "60ftcb_", true, new float[]{0F, 0.0F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Freight66centerbeam(EntityFreightBap66centerbeam.class, new Model66centerbeam(), "66ftcb_", true, new float[]{0F, 0.0F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Freight73centerbeam(EntityFreightBap73centerbeam.class, new Model73centerbeam(), "73ftcb_", true, new float[]{0F, 0.0F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	PS140(EntityFreightBapPS140.class, new ModelPS140(), "ps140_", true, new float[]{0F, 0.15F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	PS150(EntityFreightBapPS150.class, new ModelPS150(), "ps150_", true, new float[]{0F, 0.15F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	PS160(EntityFreightBapPS160.class, new ModelPS160(), "ps160_", true, new float[]{0F, 0.0F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	WVcaboose(EntityCabooseBapWVcaboose.class, new ModelWVcaboose(), "wvcaboose_", true, new float[]{0F, 0.1675F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	//OWO60Verticube(EntityFreightBapOWO60Verticube.class, new ModelOWO60Verticube(),"owo60verticube_", true, new float[]{0F, 0.1875F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PEcoach(EntityPassengerBapPEcoach.class, new ModelPEcoach(), "PECoach_", true, new float[]{0F, 0.105F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	PEobserve(EntityPassengerBapPEobserve.class, new ModelPEobserve(), "PEObserve_", true, new float[]{0F, 0.105F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	VersaLongi(EntityFreightBapVersaLongi.class, new ModelVersaLongi(), "versa_longi_", true, new float[]{0F, 0.0F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	VersaTrans(EntityFreightBapVersaTrans.class, new ModelVersaTrans(), "versa_trans_", true, new float[]{0F, 0.0F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	DOT11111000(EntityFreightBapDOT11111000.class, new Model11000DOT111(), "dot11K_", true, new float[]{0F, 0.00F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	DOT11120600(EntityFreightBapDOT11120600.class, new Model20600DOT111(), "dot206K_", true, new float[]{0F, 0.00F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	DOT11129080(EntityFreightBapDOT11129080.class, new Model29080DOT111(), "dot290K_", true, new float[]{0F, 0.00F /*was 0.20F for height*/, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	F7A(EntityLocoDieselBapF7A.class, new ModelF7A(), "F7A_", true, new float[]{-1.375F, 0.15F, 0F}, new float[]{0F, 180F, 180F}, new float[]{1F, 1.0F, 1F}, "smoke", 3, new ArrayList<double[]>() {
		{
			add(new double[]{0.9375D, 1.3D, 0.0D});
			add(new double[]{0.25D, 1.3D, 0.0D});

		}
	}, "", null, 0, false),
	F7B(EntityLocoDieselBapF7B.class, new ModelF7B(), "F7B_", true, new float[]{-1.25F, 0.15F, 0F}, new float[]{0F, 180F, 180F}, new float[]{1F, 1.0F, 1F}, "smoke", 3, new ArrayList<double[]>() {
		{
			add(new double[]{1.35D, 1.3D, 0.0D});
			add(new double[]{0.55D, 1.3D, 0.0D});

		}
	}, "", null, 0, false),
	H1044(EntityLocoDieselBapH1044.class, new ModelH1044(), "FM_H10-44_", true, new float[]{-1.1F, 0.15F, 0F}, new float[]{0F, 180F, 180F}, null, "smoke", 4, new ArrayList<double[]>() {
		{
			add(new double[]{1.9D, 1.45D, -0.16D});
			add(new double[]{1.9D, 1.45D, 0.16D});
		}
	}, "", null, 0, false),
	locoSteamStarClass(EntityLocoSteamStarClass.class, new ModelStarClass(), "StarLoco", false, new float[]{-0.8F, 0.15F, 0F}, new float[]{0F, 180F, 180F}, null, "smoke", 20, new ArrayList<double[]>() {
		{
			add(new double[]{1.65D, 1.3D, 0.0D});
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[]{1.5D, -0.4D, 0.8D});
		}
	}, 2, true),
	tenderStarClass(EntityTenderStarClass.class, new ModelStarClassTender(), "StarTender", false, new float[]{0.0F, 0.15F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	passengerStarCarFat(EntityPassengerStarCarFat.class, new ModelStarCarFat(), "GWRClosed", false, new float[]{0F, 0.15F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	passengerStarCarNotFat(EntityPassengerStarCarNotFat.class, new ModelStarCarNotFat(), "GWROpen", false, new float[]{0F, 0.15F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	LightCrane(EntityLightCrane.class, new ModelLightCrane(), "lightcrane2_", true, new float[]{0F, 0.15F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	BR155(EntityLocoElectricBR155.class, new ModelBR155(), "BR155_", true, new float[]{-1.7F, 0.05F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Onion(EntityLocoOnion.class, new ModelOnion(), "Onion_", true, new float[]{-0.7F, 0.1F, 0.0F}, new float[]{0F, 180F, 180F}, null, "largesmoke", 20, new ArrayList<double[]>() {
		{
			add(new double[]{0.6D, 1.5D, 0.0D});
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[]{1.2D, -0.4D, 0.8D});
		}
	}, 2, true),
	OnionTender(EntityTenderOnion.class, new ModelOnionTender(), "Onion_Tender_", true, new float[]{0.0F, 0.1F, 0.0F}, new float[]{0F, 0F, 180F}, null, "", 0, null, "", null, 0, false),
	loco440RFront(EntityLocoElectric440RFront.class, new Model440R_Front(), "440R_", true, new float[]{-1.9F, 0.1F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	passenger440RMid(EntityPassenger440RMid.class, new Model440R_Mid(), "440R_", true, new float[]{-0.0F, 0.1F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	passenger440RRear(EntityPassenger440RRear.class, new Model440R_Back(), "440R_", true, new float[]{0.0F, 0.1F, 0.0F}, new float[]{0F, 0F, 180F}, null, "", 0, null, "", null, 0, false),
	passengerBW305(EntityPassengerBW305.class, new ModelBW305(), "tw_", true, new float[]{0.0F, 0.18F, 0.0F}, new float[]{0.0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	LocoElectricTW305(EntityLocoElectricTW305.class, new ModelTW305(), "tw_", true, new float[]{-1.0F, 0.18F, 0.0F}, new float[]{0.0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	LocoElectricInterurbanSeries100(EntityElectricInterurbanSeries100.class, new ModelInterurbanSeries100(), "Interurban_tram_", true, new float[]{-1.5F, 0.18F, 0.0F}, new float[]{0.0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	GP13(EntityLocoDieselGP13.class, new ModelGP13(), "gp13_", true, new float[]{-0.8F, -0.47F, 0.0F}, new float[]{0F, 180F, 0F}, null, "smoke", 4, new ArrayList<double[]>() {
		{
			add(new double[]{-0.2D, 1.2D, 0.0D});
			add(new double[]{0.45D, 1.2D, 0.0D});
		}
	}, "", null, 0, false),
	DB143(EntityLocoElectricDB143.class, new ModelDB143(), "DB143", false, new float[]{-1.7F, 0.2F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	tenderPETender(EntityTenderPETender.class, new ModelPE_Tender(), "PETender", false, new float[]{0.1F, 0.15F, 0.0F}, new float[]{0F, 0F, 180F}, null, "", 0, null, "", null, 0, false),
	locoSteamPELoco(EntityLocoSteamPELoco.class, new ModelPE_Loco(), "PELoco", false, new float[]{-1.5F, 0.15F, 0.0F}, new float[]{0, 180, 180}, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[]{3.1D, 1.4D, 0D});
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[]{2.9D, 0.05D, 0.65D});
		}
	}, 2, true),
	BapB23(EntityLocoDieselBapB23.class, new ModelB23(), "b23_", true, new float[]{-1.7F, 0.155F, 0F}, new float[]{0F, 180F, 180F}, null, "smoke", 4, new ArrayList<double[]>() {
		{
		}
	}, "", null, 0, false),
	C424(EntityLocoDieselBapC424.class, new ModelC424(), "c424_", true, new float[]{-1.6F, 0.1F, 0F}, new float[]{0F, 180F, 180F}, null, "largesmoke", 2, new ArrayList<double[]>() {
		{
			add(new double[]{1D, 1.65D, 0.0D});
		}
	}, "", null, 0, false),
	C425(EntityLocoDieselBapC425.class, new ModelC425(), "c425_", true, new float[]{-1.6F, 0.1F, 0F}, new float[]{0F, 180F, 180F}, null, "largesmoke", 2, new ArrayList<double[]>() {
		{
			add(new double[]{1D, 1.65D, 0.0D});
		}
	}, "", null, 0, false),
	GP9(EntityLocoDieselBapGP9.class, new ModelGP9(), "gp9_", true, new float[]{-1.5F, -0.05F, 0F}, new float[]{0F, 180F, 180F}, null, "smoke", 5, new ArrayList<double[]>() {
		{
			add(new double[]{0.45D, 1.35D, 0.0D});
			add(new double[]{1.25D, 1.35D, 0.0D});
		}
	}, "", null, 0, false),
	GP7b(EntityLocoDieselBapGP7b.class, new ModelGP7b(), "bettergp7b_", true, new float[]{-1.5F, -0.05F, 0F}, new float[]{0F, 180F, 180F}, null, "smoke", 5, new ArrayList<double[]>() {
		{
			add(new double[]{0.45D, 1.35D, 0.0D});
			add(new double[]{1.25D, 1.35D, 0.0D});
		}
	}, "", null, 0, false),
	GP7u(EntityLocoDieselBapGP7u.class, new ModelGP7u(), "gp7u_", true, new float[]{-1.5F, -0.05F, 0F}, new float[]{0F, 180F, 180F}, null, "smoke", 5, new ArrayList<double[]>() {
		{
			add(new double[]{0.45D, 1.35D, 0.0D});
			add(new double[]{1.25D, 1.35D, 0.0D});

		}
	}, "", null, 0, false),
	GP7(EntityLocoDieselBapGP7.class, new ModelGP7BAP(), "bettergp7_", true, new float[]{-1.5F, -0.05F, 0F}, new float[]{0F, 180F, 180F}, null, "smoke", 5, new ArrayList<double[]>() {
		{
			add(new double[]{0.45D, 1.35D, 0.0D});
			add(new double[]{1.25D, 1.35D, 0.0D});
		}
	}, "", null, 0, false),
	GP30(EntityLocoDieselBapGP30.class, new ModelGP30(), "gp30_", true, new float[]{-1.5F, 0.155F, 0F}, new float[]{0F, 180F, 180F}, null, "smoke", 4, new ArrayList<double[]>() {
		{
			//add(new double[]{1.9D, 1.4D, 0.0D});
		}
	}, "", null, 0, false),
	GP38dash2(EntityLocoDieselBapGP38dash2.class, new ModelGP38dash2(), "gp38dash2_", true, new float[]{-1.5F, 0.155F, 0F}, new float[]{0F, 180F, 180F}, null, "smoke", 3, new ArrayList<double[]>() {
		{
			add(new double[]{0.75D, 1.4D, 0.0D});
			add(new double[]{1.55D, 1.4D, 0.0D});
		}
	}, "", null, 0, false),
	KOF_III(EntityLocoDieselKof_III.class, new ModelKOF_III(), "KofIII_", true, new float[]{-0.8F, 0.15F, 0.0F}, new float[]{0F, 180F, 180F}, null, "smoke", 4, new ArrayList<double[]>() {
		{
			add(new double[]{0.5D, 1.0D, 0.0D});
		}
	}, "", null, 0, false),
	KOF_III_M(EntityLocoDieselKof_III_M.class, new ModelKOF_III_M(), "KofIIIM_", true, new float[]{-0.8F, 0.15F, 0.0F}, new float[]{0F, 180F, 180F}, null, "smoke", 4, new ArrayList<double[]>() {
		{
			add(new double[]{0.5D, 1.0D, 0.0D});
		}
	}, "", null, 0, false),
	U36C(EntityLocoDieselBapU36C.class, new ModelU36C(), "u36c_", true, new float[]{-2.3125F, -0.15F/* -0.13F*/, 0F}, new float[]{0F, 180F, 180F}, new float[]{1F, 1F, 1F}, "smoke", 3, new ArrayList<double[]>() {
		{
			//add(new double[]{0.75D, 1.75D, 0.0D});

		}
	}, "", null, 0, false),
	GP49(EntityLocoDieselBapGP49.class, new ModelGP49(), "gp49_arr_2807", false, new float[]{-1.5F, 0.155F, 0F}, new float[]{0F, 180F, 180F}, null, "smoke", 3, new ArrayList<double[]>() {
		{
		}
	}, "", null, 0, false),
	GP15(EntityLocoDieselBapGP15.class, new ModelBapGP15(), "gp15_bap_", true, new float[]{-1.3F, 0.155F, 0F}, new float[]{0F, 180F, 180F}, null, "smoke", 5, new ArrayList<double[]>() {
		{
		}
	}, "", null, 0, false),
	spookyGarrattFront(EntityLocoSteamGarrattFront.class, new ModelGarrattFront(), "GarrattTexture", false, new float[]{3.5F, 0.155F, 0.0F},/*position*/  new float[]{0F, 180F, 180F}, new float[]{1f, 1f, 1f},/*scale*/ "largesmoke", 20, new ArrayList<double[]>() {
		{
			//add(new double[] { 4.65D, 1.7D, 0.0D });//smoke
		}
	}, "explode", new ArrayList<double[]>() {
		{
			//add(new double[] { 4.2D, -0.4D, 0.8D });//steam
		}
	}, 2, true),
	spookyGarrattRear(EntityLocoSteamGarrattRear.class, new ModelGarrattBack(), "GarrattTexture", false, new float[]{3.25F, 0.155F, 0.0F},/*position*/  new float[]{0F, 0F, 180F}, new float[]{1f, 1f, 1f},/*scale*/ "largesmoke", 20, new ArrayList<double[]>() {
		{
			//add(new double[] { 4.65D, 1.7D, 0.0D });//smoke
		}
	}, "explode", new ArrayList<double[]>() {
		{
			//add(new double[] { 4.2D, -0.4D, 0.8D });//steam
		}
	}, 2, true),
	spookyGarrattMid(EntityLocoSteamGarrattMid.class, new ModelGarrattMid(), "GarrattTexture", false, new float[]{-2.25F, 0.155F, 0.0F},/*position*/  new float[]{0F, 0F, 180F}, new float[]{1f, 1f, 1f},/*scale*/ "largesmoke", 20, new ArrayList<double[]>() {
		{
			//add(new double[] { 4.65D, 1.7D, 0.0D });//smoke
		}
	}, "explode", new ArrayList<double[]>() {
		{
			//add(new double[] { 4.2D, -0.4D, 0.8D });//steam
		}
	}, 2, true),
	Skook(EntityLocoSteamSkook.class, new ModelSkookum(), "skookum", false, new float[]{-0.0F, -0.0F, -0.0F}, new float[]{0F, 180F, 180F}, null, "largesmoke", 20, new ArrayList<double[]>() {
		{
			add(new double[]{2.4D, 1.5D, -0.0D});
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[]{0.9D, -0.4D, 0.8D});
			add(new double[]{2.5D, -0.4D, 0.8D});
			add(new double[]{-0.5D, 1.5D, 0.0D});
		}
	}, 2, true),
	SkookTender(EntityTenderSkookTender.class, new ModelSkookumTender(), "skookumtender", false, new float[]{-0.00F, 0.0F, 0F}, new float[]{0F, 0F, 180F}, null, "", 0, null, "", null, 0, false),
	EF1(EntityLocoElectricBapEF1.class, new ModelEF1(), "ef1_", true, new float[]{-1.60F, 0.1875F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	EF1B(EntityLocoElectricBapEF1B.class, new ModelEF1B(), "ef1b_", true, new float[]{-1.15635F, 0.1875F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	EP1A(EntityLocoElectricBapEP1A.class, new ModelEP1A(), "ep1a_", true, new float[]{-1.60F, 0.1875F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	SD9(EntityLocoDieselBapSD9.class, new ModelSD9(), "SD9_", true, new float[]{-1.6F, 0.155F, 0F}, new float[]{0F, 180F, 180F}, null, "smoke", 3, new ArrayList<double[]>() {
		{
			//add(new double[]{0.8D, 1.4D, 0.0D});
			//add(new double[]{1.6D, 1.4D, 0.0D});
		}
	}, "", null, 0, false),
	SD40dash2(EntityLocoDieselBapSD40dash2.class, new ModelSD40dash2(), "sd40_", true, new float[]{-1.9F, 0.155F, 0F}, new float[]{0F, 180F, 180F}, null, "smoke", 6, new ArrayList<double[]>() {
		{
			//add(new double[]{2.3D, 1.5D, 0.0D});
		}
	}, "", null, 0, false),
	WWCP40FootBox(EntityFreightWWCP40FootBox.class, new ModelWWCP40FootBox(), "40ft_Boxcar_", true, new float[]{0F, 0.1875F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	//HuskyStackWellcar(EntityFreightBapHuskyStack.class, new ModelHuskyStack(), "huskystack_", true, new float[]{0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	U23B(EntityLocoDieselBapU23B.class, new ModelU23B(), "U23B_", true, new float[]{-0F, -0.0F, 0F}, null, null, "smoke", 4, new ArrayList<double[]>() {
		{
		}
	}, "", null, 0, false),
	U18B(EntityLocoDieselBapU18B.class, new ModelU18B(), "U18B_", true, new float[]{-0F, -0.0F, 0F}, null, null, "smoke", 4, new ArrayList<double[]>() {
		{
		}
	}, "", null, 0, false),
	hicube60foot(EntityFreightBaphicube60foot.class, new Modelhicube60foot(), "hicube60_", true, new float[]{0F, 0.155F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	freightBNSFGon(EntityFreightBNSFGon.class, new ModelBNSFGon(), "BNSFMillGon_", true, new float[]{0.0F, 0.0F, 0.0F}, null, null, "", 0, null, "", null, 0, false),
	locoILMA(EntityLocoElectricILMA.class, new ModelILMA(), "ILMA_", true, new float[]{0.0F, 0.15F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	locoILMB(EntityLocoElectricILMB.class, new ModelILMB(), "ILMB_", true, new float[]{0.0F, 0.15F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Feve3300Front(EntityLocoElectricFeve3300.class, new Modelfeve3300front(), "feve3300_", true, new float[]{-1.8F, 0.18F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Feve3300Rear(EntityPassengerFeve3300.class, new Modelfeve3300rear(), "feve3300_", true, new float[]{-0.0F, 0.18F, 0.0F}, new float[]{0F, 0F, 180F}, null, "", 0, null, "", null, 0, false),
	HH660(EntityLocoDieselBapHH660.class, new ModelHH660(), "hh600_", true, new float[]{-1F, -0.1F, 0F}, new float[]{0F, 180F, 180F}, null, "smoke", 4, new ArrayList<double[]>() {
		{
			add(new double[]{2.0D, 1.35D, 0D});
		}
	}, "", null, 0, false),
	Krautt(EntityLocoDieselBapKrautt.class, new ModelKrautt(), "KM_ML4000_", true, new float[]{0F, 0.0F, 0F}, new float[]{0F, 0F, 0F}, null, "smoke", 6, new ArrayList<double[]>() {
		{
		}
	}, "", null, 0, false),
	BoxMotor(EntityLocoElectricBoxMotor.class, new boxmotor(), "BoxMotorTexture", false, new float[]{-1.8F, 0.1F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Hopper5201(EntityFreightBapHopper5201.class, new ModelHopper5201(), "5201_", true, new float[]{-0F, 0.0F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Hopper6260(EntityFreightBapHopper6260.class, new ModelHopper6260(), "6260_", true, new float[]{-0F, 0.0F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Skeleton(EntityFreightBapSkeletonLogCar.class, new ModelSkeletonLogCar(), "SkeletonLogCar_", true, new float[]{0.0F, -0.0F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Shay3Truck(EntityLocoSteamShay3Truck.class, new ModelShay3Truck(), "3truckShay_", true, new float[]{0F, 0.0F, 0F}, new float[]{0F, 0F, 0F}, null, "largesmoke", 4, new ArrayList<double[]>() {
		{
			add(new double[]{2.15D, 1.3D, -0.17D});//1.1D
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[]{0.9D, -0.4D, 0.6D});
			//add(new double[] { 0.6D, 1.1D, 0.0D });
		}
	}, 2, true),
	Shay3TruckTender(EntityTenderShay3Truck.class, new ModelShay3TruckTender(), "3truckShay_", true, new float[]{0.0F, 0.0F, 0.0F}, new float[]{0F, 0F, 0F}, null, "", 0, null, "", null, 0, false),
	Dash840B(EntityLocoDieselBapDash840B.class, new ModelDash840B(), "dash8_40b_", true, new float[]{-0F, -0.0F, 0F}, null, null, "smoke", 4, new ArrayList<double[]>() {
		{
		}
	}, "", null, 0, false),
	Class44(EntityLocoDieselClass44.class, new ModelClass44(), "Class44_", true, new float[]{0F, 0.0F, 0.0F}, new float[]{0F, 180F, 0F}, null, "largesmoke", 1, new ArrayList<double[]>() {
		{
			add(new double[]{2.3D, 1.6D, 0D});
		}
	}, "", null, 0, false),
	EU07(EntityLocoElectricEU07.class, new EU07Modernised(), "EU07_", true, new float[]{-0F, 0.00F, 0.0F}, new float[]{0F, 0F, 0F}, new float[]{0.9f, 0.9f, 0.9f}, "", 0, null, "", null, 0, false),
	SW1(EntityLocoDieselBapSW1.class, new ModelSW1(), "sw1_", true, new float[]{-0.0F, 0.0F, 0F}, new float[]{0F, 180F, 180F}, null, "smoke", 3, new ArrayList<double[]>() {
	}, "", null, 0, false),
	SW1500(EntityLocoDieselBapSW1500.class, new ModelSW1500(), "sw1500_", true, new float[]{-0.0F, 0.0F, 0F}, new float[]{0F, 180F, 180F}, null, "smoke", 3, new ArrayList<double[]>() {
	}, "", null, 0, false),
	GM6C(EntityLocoElectricBapGM6C.class, new ModelGM6C(), "GM6C_demo", false, new float[]{-0.0F, 0.0F, 0F}, new float[]{0F, 180F, 0F}, null, "", 0, null, "", null, 0, false),
	Dash840C(EntityLocoDieselBapDash840C.class, new ModelDash840C(), "dash8_40c_", true, new float[]{-0F, -0.0F, 0F}, null, null, "smoke", 4, new ArrayList<double[]>() {
		{
		}
	}, "", null, 0, false),
	SW1200(EntityLocoDieselBapSW1200.class, new ModelSW1200(), "sw1200_", true, new float[]{-0.0F, 0.0F, 0F}, new float[]{0F, 180F, 180F}, null, "smoke", 3, new ArrayList<double[]>() {
	}, "", null, 0, false),
	RSD15(EntityLocoDieselBapRSD15.class, new ModelRSD15(), "RSD15_", true, new float[]{-0.0F, 0.0F, 0F}, new float[]{0F, 180F, 180F}, null, "smoke", 6, new ArrayList<double[]>() {
	}, "", null, 0, false),
	PSBaggage(EntityFreightPS73Baggage.class, new ModelPS73Baggage(), "PS_Baggage_", true, new float[]{0F, 0.15F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	ES44(EntityLocoDieselBapES44.class, new ModelES44(), "es44_", true, new float[]{-2.2F, 0.15F, 0F}, new float[]{0F, 180F, 180F}, null, "smoke", 5, new ArrayList<double[]>() {
		{
			add(new double[]{1.0D, 1.4D, 0.0D});

		}
	}, "", null, 0, false),
	Dash9_44CW(EntityLocoDieselBapDash9_44CW.class, new ModelDash9_44CW(), "d9-44cw_", true, new float[]{-2.2F, 0.15F, 0F}, new float[]{0F, 180F, 180F}, null, "smoke", 5, new ArrayList<double[]>() {
		{

		}
	}, "", null, 0, false),
	SD70Mac(EntityLocoDieselBapSD70Mac.class, new ModelSD70Mac(), "sd70mac_", true, new float[]{-2.1F, 0.15F, 0F}, new float[]{0F, 180F, 180F}, null, "smoke", 5, new ArrayList<double[]>() {

		{
			add(new double[]{2.35D, 1.5D, 0.0D});
		}
	}, "", null, 0, false),
	Dash840BB(EntityLocoDieselBapDash840BB.class, new ModelDash840BB(), "dash8_40b_b_", true, new float[]{-0F, -0.0F, 0F}, null, null, "smoke", 4, new ArrayList<double[]>() {
		{
		}
	}, "", null, 0, false),
	Dash840BW(EntityLocoDieselBapDash840BW.class, new ModelDash840BW(), "dash8_40bw_", true, new float[]{-0F, -0.0F, 0F}, null, null, "smoke", 4, new ArrayList<double[]>() {
		{
		}
	}, "", null, 0, false),
	PSBaggage85(EntityFreightPS85Baggage.class, new ModelPS85Baggage(), "PS_lightweight_85_baggage_", true, new float[]{0F, 0.15F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Reefer64(EntityFreightBapReefer64Foot.class, new ModelReefer64Foot(), "reefer_64_", true, new float[]{0F, 0.155F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	DH643(EntityLocoDieselBapDH643.class, new ModelDH643(), "alco_dh423_not_dumb", false, new float[]{-0.0F, 0.0F, 0F}, new float[]{0F, 180F, 180F}, null, "smoke", 6, new ArrayList<double[]>() {
	}, "", null, 0, false),
	CF7(EntityLocoDieselBapCF7.class, new ModelCF7Angle(), "CF7_Angle_", true, new float[]{-0F, -0.0F, 0F}, new float[]{0F, 0F, 0F}, null, "smoke", 6, new ArrayList<double[]>() {
		{
		}
	}, "", null, 0, false),
	CF7round(EntityLocoDieselBapCF7round.class, new ModelCF7round(), "CF7_Round_", true, new float[]{-0F, -0.0F, 0F}, new float[]{0F, 0F, 0F}, null, "smoke", 6, new ArrayList<double[]>() {
		{
		}
	}, "", null, 0, false),
	alcoS2(EntityLocoDieselBapAlcoS2.class, new ModelAlcoS2(), "alcos2_", true, new float[]{0f, 0f, 0f}, new float[]{0F, 180F, 180F}, null, "smoke", 5, new ArrayList<double[]>() {
		{
			add(new double[]{0.7D, 1.3D, -0.18D});
		}
	}, "", null, 0, false),
	NRE3gs21b(EntityLocoDieselBapNRE3gs21b.class, new ModelNRE3gs21b(), "3gs21b_", true, new float[]{-1.5F, 0.155F, 0F}, new float[]{0F, 180F, 180F}, null, "smoke", 3, new ArrayList<double[]>() {
		{
			add(new double[]{0.15D, 1.3D, 0.0D}); //farthest from cab
			add(new double[]{1.05D, 1.3D, 0.0D}); //middle
			add(new double[]{2.0D, 1.3D, 0.0D}); // closest to cab
		}
	}, "", null, 0, false),
	Beep(EntityLocoDieselBapBeep.class, new ModelBeep(), "atsfbeep", false, new float[]{-0F, 0.0F, 0F}, new float[]{0F, 180F, 180F}, null, "smoke", 4, new ArrayList<double[]>() {
		{
			add(new double[]{1.45D, 1.25D, 0.0D});
			add(new double[]{1.65D, 1.25D, 0.0D});
			add(new double[]{1.05D, 1.25D, 0.0D});
			add(new double[]{1.25D, 1.25D, 0.0D});
		}
	}, "", null, 0, false),
	GP38dash9W(EntityLocoDieselBapGP38dash9W.class, new ModelGP38dash9W(), "GP38dash9W_Green", false, new float[]{-1.5F, 0.155F, 0F}, new float[]{0F, 180F, 180F}, null, "smoke", 3, new ArrayList<double[]>() {
		{
		}
	}, "", null, 0, false),
	class158motor(EntityLocoDieselClass158.class, new ModelClass158(), "Class_158_", true, new float[]{-1.85F, -0.45F, 0.0F}, new float[]{0F, 180F, 180F}, null, "smoke", 2, new ArrayList<double[]>() {
		{
		}
	}, "", null, 0, false),
	class158car(EntityClass158Coach.class, new ModelClass158Middle(), "Class_158_", true, new float[]{0.5F, -0.45F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	//HBC1C(EntityCabooseBapHBC1C.class, new ModelHBC1C(),"HBC1C_", true, null, null, null, "", 0, null, "", null, 0, false),
	DRGWCaboose(EntityCabooseBapDRGW.class, new ModelDRGW01400Caboose(), "BAP_DRGW_01400_", true, null, null, null, "", 0, null, "", null, 0, false),
	passengerPSSleeper565(EntityPassengerPSSleeper565.class, new ModelPSSleeper565(), "PS_lightweight_5-6-5_sleeper_", true, new float[]{0F, 0.15F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	passengerPSSleeper565DRGW(EntityPassengerPSSleeper565DRGW.class, new ModelPSSleeper565DRGW(), "PS_DRGW_lightweight_5-6-5_sleeper", false, new float[]{0F, 0.15F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	AlcoPA1(EntityLocoDieselAlcoPA1.class, new ModelAlcoPA(), "AlcoPA1_", true, new float[]{-1.6F, 0.15F, 0F}, new float[]{0F, 180F, 180F}, new float[]{1F, 1.0F, 1F}, "smoke", 3, new ArrayList<double[]>() {
		{
		}
	}, "", null, 0, false),
	AlcoPB1(EntityLocoDieselAlcoPB1.class, new ModelAlcoPB(), "AlcoPB1_", true, new float[]{-1.55F, 0.15F, 0F}, new float[]{0F, 180F, 180F}, new float[]{1F, 1.0F, 1F}, "smoke", 3, new ArrayList<double[]>() {
		{
		}
	}, "", null, 0, false),
	EMDE8A(EntityLocoDieselEMDE8A.class, new ModelEMDE8A(), "EMDE8A_", true, new float[]{-1.85F, 0.15F, 0F}, new float[]{0F, 180F, 180F}, new float[]{1F, 1.0F, 1F}, "smoke", 3, new ArrayList<double[]>() {
		{
		}
	}, "", null, 0, false),

	//tcce4 new stuff
	SNCB_M6(EntityPassengerSNCB_M6.class, new ModelSNCB_M6(), "SNCB_M6_", true, new float[]{-2.0f, .095F, 0F}, new float[]{0f, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	SNCB_M6_TAIL(EntityPassengerSNCB_M6_TAIL.class, new ModelSNCB_M6_TAIL(), "SNCB_M6_Tail_", true, new float[]{-2.30F, 0.04f, 0F}, new float[]{0F, 0, 180F}, null, "", 0, null, "", null, 0, false),

	Class153Engine(EntityLocoDieselClass153.class, new ModelClass153(), "class_153_", true, new float[]{-2.1F, 0.18F, 0F}, new float[]{0F, 180F, 180F}, null, "smoke", 3, new ArrayList<double[]>() {
	}, "", null, 0, false),
	Class153Coach(EntityPassengerClass153.class, new ModelClass153(), "class_153_", true, new float[]{0F, 0.18F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Class156Engine(EntityLocoDieselClass156.class, new ModelClass156(), "Class_156_", true, new float[]{-1.3F, -0.57F, 0F}, new float[]{0F, 180F, 180F}, null, "smoke", 3, new ArrayList<double[]>() {
	}, "", null, 0, false),
	Class47(EntityLocoDieselClass47.class, new ModelClass47(), "Class_47_", true, new float[]{-4f, 0f, 0f}, new float[]{0f, 180f, 180f}, null, "smoke", 3, new ArrayList<double[]>() {
	}, "", null, 0, false),
	Class319Engine(EntityElectricClass319.class, new ModelClass319Engine(), "Br_319_", true, new float[]{-1.65F, 0.15F, 0F}, new float[]{0F, 180F, 180F}, null, "smoke", 3, new ArrayList<double[]>(), "", null, 0, false),
	Class319Middle(EntityPassengerClass319Middle.class, new ModelClass319Middle(), "Br_319_", true, new float[]{0F, 0.15F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Class319Panto(EntityPassengerClass319Panto.class, new ModelClass319Panto(), "Br_319_", true, new float[]{0F, 0.15F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Class319Tail(EntityPassengerClass319Tail.class, new ModelClass319Engine(), "Br_319_", true, new float[]{0F, 0.15F, 0F}, new float[]{0F, 0F, 180F}, null, "", 0, null, "", null, 0, false),
	PSRPOPM(EntityFreightPSRPOPM.class, new ModelPSRPOPM(), "PSRPOPM_", true, new float[]{0F, 0.15F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	PSRPO(EntityFreightPSRPO.class, new ModelPSRPO(), "PSRPO_", true, new float[]{0F, 0.15F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	KVB_2300(EntityElectricKVB_2300.class, new ModelKVB_2300(), "kvb_2300_", true, new float[]{-1.25F, 0.15F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	KVB_2300_B(EntityPassengerKVB_2300_B.class, new ModelKVB_2300_B(), "kvb_2300_", true, new float[]{-1.25F, 0.15F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	//tcce5 new stuff (its mixed around in the file tbh)
	BR_MK2F_Coach(EntityPassengerBR_MK2F_Coach.class, new ModelBR_MK2F_Coach(), "BR_Mk2f_", true, new float[]{0.485F, 0F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	BR_MK2F_BSO(EntityPassengerBR_MK2F_BSO.class, new ModelBR_MK2F_BSO(), "BR_Mk2f_BSO_", true, new float[]{0.485F, 0F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	BR_MK2F_DBSO(EntityElectricBR_MK2F_DBSO.class, new ModelBR_MK2F_DBSO(), "BR_Mk2f_DBSO_", true, new float[]{-1.5F, 0F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	BR_MK3_Buffet(EntityPassengerBR_MK3_Buffet.class, new ModelBR_MK3_Buffet(), "BR_Mk3_Buffet_", true, new float[]{0.15F, 0F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	BR_MK3_Coach(EntityPassengerBR_MK3_Coach.class, new ModelBR_MK3_Coach(), "BR_Mk3_Coach_", true, new float[]{0.15F, 0F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	BR_MK3a_Coach(EntityPassengerBR_MK3a_Coach.class, new ModelBR_Mk3a_Coach(), "BR_Mk3a_", true, new float[]{0.15F, 0F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	BR_MK3_Pantograph(EntityPassengerBR_MK3_Pantograph.class, new ModelBR_MK3_Pantograph(), "BR_Mk3_Pantograph_", true, new float[]{0.15F, 0F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	BR_MK3_DVT(EntityElectricBR_MK3_DVT.class, new ModelBR_MK3_DVT(), "BR_Mk3_DVT_", true, new float[]{-1.5F, 0F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	BR_MK4_DVT(EntityElectricBR_MK4_DVT.class, new ModelBR_MK4_DVT(), "BR_Mk4_DVT_", true, new float[]{-1.9F, 0F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	BR_MK4_Coach(EntityPassengerBR_MK4_Coach.class, new ModelBR_MK4_Coach(), "BR_Mk4_", true, new float[]{0.2F, 0F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	BR_MK4_Buffet(EntityPassengerBR_MK4_Buffet.class, new ModelBR_MK4_Buffet(), "BR_Mk4_Buffet_", true, new float[]{0.22F, 0F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Class43(EntityLocoDieselClass43.class, new ModelClass43(), "Class_43_", true, new float[]{-0.65F, 0F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Class90(EntityElectricClass90.class, new ModelClass90(), "Class_90_", true, new float[]{-0.55F, 0F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Class91(EntityElectricClass91.class, new ModelClass91(), "Class_91_", true, new float[]{-1.2F, 0.05F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Class321(EntityElectricClass321.class, new ModelClass321(), "Class_321_", true, new float[]{-1.2F, -0.455F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Class321Panto(EntityPassengerClass321Panto.class, new ModelClass321_Panto(), "Class_321_Panto_Car_", true, new float[]{0.6F, -0.455F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Class321Coach(EntityPassengerClass321Coach.class, new ModelClass321Coach(), "Class_321_Trailer_Car_", true, new float[]{0.6F, -0.455F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	passengerMinetrain(EntityPassengerMinetrain.class, new ModelPassengerMinetrain(), "minetrain", false, new float[]{0.0F, -0.47F, 0.0F}, null, null, "", 0, null, "", null, 0, false),
	asteri(EntityLocoSteamasteri.class, new Modelasteri(), "asteri", false, new float[]{-1.0F, 0.16F, 0F}, new float[]{5F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	//TCCE6
	C415H(EntityLocoDieselC415H.class, new ModelC415H(), "C415h_", true, new float[]{0F, 0.0F, 0F}, new float[]{0F, 180F, 180F}, null, "smoke", 4, new ArrayList<double[]>() {
		{
		}
	}, "", null, 0, false),
	C415S(EntityLocoDieselC415S.class, new ModelC415S(), "C415s_", true, new float[]{0F, 0.0F, 0F}, new float[]{0F, 180F, 180F}, null, "smoke", 4, new ArrayList<double[]>() {
		{
		}
	}, "", null, 0, false),
	C415L(EntityLocoDieselC415L.class, new ModelC415L(), "C415l_", true, new float[]{-1.2F, 0.105F, 0F}, new float[]{0F, 180F, 180F}, null, "smoke", 4, new ArrayList<double[]>() {
		{
			add(new double[]{1.85D, 1.55D, 0.0D});
		}
	}, "", null, 0, false),
	GE25Ton(EntityLocoDieselGE25Ton.class, new ModelGE25Ton(), "25ton_", true, new float[]{0.0F, 0.15F, 0F}, new float[]{0F, 180F, 180F}, null, "smoke", 3, new ArrayList<double[]>() {
		{
			add(new double[]{0.6D, 1.1D, 0.0D});
		}
	}, "", null, 0, false),
	GSI60FootBulkhead(EntityFreightGSI60FootBulkhead.class, new ModelGSI60FootBulkheadFlat(), "gsi_60bulk_", true, new float[]{0F, 0.0F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	GSC60FootFlat(EntityFreightGSC60FootFlat.class, new ModelGSI60FootBulkheadFlat(), "gsc_60flat_", true, new float[]{0F, 0.0F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	FMH24_66(EntityLocoDieselFMH24_66.class, new ModelFMH24_66(), "FM_H24-66_", true, new float[]{-1.9F, 0.15F, 0F}, new float[]{0F, 180F, 180F}, null, "smoke", 4, new ArrayList<double[]>() {
		{
			//add(new double[]{1.85D, 1.55D, 0.0D});
		}
	}, "", null, 0, false),
	FMH24_66L(EntityLocoDieselFMH24_66L.class, new ModelFMH24_66L(), "FM_H24-66_L_", true, new float[]{-1.9F, 0.15F, 0F}, new float[]{0F, 180F, 180F}, null, "smoke", 3, new ArrayList<double[]>() {
		{
		}
	}, "", null, 0, false),
	EMDE8B(EntityLocoDieselEMDE8B.class, new ModelEMDE8B(), "EMDE8B_", true, new float[]{-1.75F, 0.15F, 0F}, new float[]{0F, 180F, 180F}, new float[]{1F, 1.0F, 1F}, "smoke", 3, new ArrayList<double[]>() {
		{
		}
	}, "", null, 0, false),
	passengerPSLunchCounter_Lounge(EntityPassengerPSLunchCounter_Lounge.class, new ModelPSLunchCounter_Lounge(), "PS_lightweight_LunchCounter_Lounge_", true, new float[]{0F, 0.15F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	passengerPS30SeatParlor(EntityPassengerPS30SeatParlor.class, new ModelPS30SeatParlor(), "PS_lightweight_30SeatParlor_", true, new float[]{0F, 0.15F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	passengerPS54SeatCoach_Lounge(EntityPassengerPS54SeatCoach_Lounge.class, new ModelPS54SeatCoach_Lounge(), "PS_lightweight_54SeatCoach_Lounge_", true, new float[]{0F, 0.15F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	passengerPS58SeatCoach_Observation(EntityPassengerPS58SeatCoach_Observation.class, new ModelPS58SeatCoach_Observation(), "PS_lightweight_58SeatCoach_Observation_", true, new float[]{0F, 0.15F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	passengerPSBM56SeatCoach(EntityPassengerPSBM56SeatCoach.class, new ModelPSBM56SeatCoach(), "PS_lightweight_BM56SeatCoach_", true, new float[]{0F, 0.15F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	passengerPSBMCombine(EntityPassengerPSBMCombine.class, new ModelPSBMCombine(), "PS_lightweight_BMCombine_", true, new float[]{0F, 0.15F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	passengerPSBMDiner_Lounge(EntityPassengerPSBMDiner_Lounge.class, new ModelPSBMDiner_Lounge(), "PS_lightweight_BMDiner_Lounge_", true, new float[]{0F, 0.15F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	EMDE7A(EntityLocoDieselEMDE7A.class, new ModelEMDE7A(), "EMDE7A_", true, new float[]{-1.85F, 0.15F, 0F}, new float[]{0F, 180F, 180F}, new float[]{1F, 1.0F, 1F}, "smoke", 3, new ArrayList<double[]>() {
		{
		}
	}, "", null, 0, false),
	EMDE7B(EntityLocoDieselEMDE7B.class, new ModelEMDE7B(), "EMDE7B_", true, new float[]{-1.75F, 0.15F, 0F}, new float[]{0F, 180F, 180F}, new float[]{1F, 1.0F, 1F}, "smoke", 3, new ArrayList<double[]>() {
		{
		}
	}, "", null, 0, false),
	freight5Plank(EntityFreight5Plank.class, new Model5Plank(), "5_plank_", true, new float[]{0f, 0.15f, 0f}, new float[]{0f, 180f, 180f}, null, "", 0, null, "", null, 0, false),
	NMBS_HLE_18(EntityLocoElectricNMBS_HLE_18.class, new ModelNMBS_HLE_18(), "hle19_", true, new float[]{-1.5F, 0.05F, 0}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	BR_Mk_1_BSO(EntityPassengerBR_Mk1_BSO.class, new ModelBR_Mk1_BSO(), "BR_Mk1_BSO_", true, new float[]{0, 0, 0,}, new float[]{0, 180, 180}, null, "", 0, null, "", null, 0, false),
	BR_Mk_1_TSO(EntityPassengerBR_Mk1_TSO.class, new ModelBR_Mk1_TSO(), "BR_Mk1_TSO_", true, new float[]{0, 0, 0,}, new float[]{0, 180, 180}, null, "", 0, null, "", null, 0, false),
	BR_Mk_1_Buffet(EntityPassengerBR_Mk1_Buffet.class, new ModelBR_Mk1_Buffet(), "BR_Mk1_Buffet_", true, new float[]{0, 0, 0,}, new float[]{0, 180, 180}, null, "", 0, null, "", null, 0, false),
	BR_Mk_1_TPO_Stowage(EntityFreightBR_Mk1_TPO_Stowage.class, new ModelBR_Mk1_TPO_Stowage(), "BR_Mk1_TPO_", true, new float[]{0F, 0F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	BR_Mk_1_BG(EntityPassengerBR_Mk1_BG.class, new ModelBR_Mk1_BG(), "BR_Mk1_BG_", true, new float[]{0, 0, 0}, new float[]{0, 180, 180}, null, "", 0, null, "", null, 0, false),
	Class175(EntityLocoDieselClass175.class, new ModelClass175(), "Class_175_", true, new float[]{-2.25f, -0.127f, 0}, new float[]{0, 180, 180}, null, "smoke", 1, new ArrayList<double[]>() {
	}, "", null, 0, false),
	Class175Coach(EntityPassengerClass175Coach.class, new ModelClass175Coach(), "Class_175_Middle_Car_", true, new float[]{0, -0.127f, 0}, new float[]{0, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	FMH16_66(EntityLocoDieselFMH16_66.class, new ModelFMH16_66(), "FM_H16-66_", true, new float[]{-1.7F, 0.15F, 0F}, new float[]{0F, 180F, 180F}, null, "smoke", 4, new ArrayList<double[]>() {
		{
			//add(new double[]{1.85D, 1.55D, 0.0D});
		}
	}, "", null, 0, false),
	ACFGNRPO_30(EntityPassengerACFGNRPO_30.class, new ModelACFGNRPO_30(), "AC&F_lightweight_GNRPO30_", true, new float[]{0F, 0.15F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	ACFGN60SeatCoach(EntityPassengerACFGN60SeatCoach.class, new ModelACFGN60SeatCoach(), "AC&F_lightweight_GN60SeatCoach_", true, new float[]{0F, 0.15F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	FGV4300Motor(EntityLocoElectricFGV4300.class, new ModelFGV4300Motor(), "4300_motorcar", false, new float[]{-1.3F, -0.03F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	FGV4300Coach(EntityPassengerFGV4300Coach.class, new ModelFGV4300Coach(), "4300_middle", false, new float[]{0F, -0.03F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	FGV4300Tail(EntityPassengerFGV4300Tail.class, new ModelFGV4300Tail(), "4300_motorcar", false, new float[]{0F, -0.03F, 0F}, new float[]{0F, 0F, 180F}, null, "", 0, null, "", null, 0, false),
	MetroMadrid3000Loco(EntityElectricMetro3000Motor.class, new ModelMetroMadrid3000Loco(), "MM3000_", true, new float[]{-1.5F, 0.2F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	PassengerMetro3000(EntityPassengerMetro3000.class, new ModelMetroMadrid3000Passenger(), "MM3000_", true, new float[]{0F, 0.2F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	PassengerMetro3000Tail(EntityPassengerMetro3000Tail.class, new ModelMetroMadrid3000Loco(), "MM3000_", true, new float[]{0F, 0.2F, 0F}, new float[]{0F, 0F, 180F}, null, "", 0, null, "", null, 0, false),
	CQ310(EntityElectricCQ310Loco.class, new Modelcq310loco(), "CQ_310_", true, new float[]{-1.5F, 0.2F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	CQ310Passenger(EntityPassengerCQ310Passenger.class, new Modelcq310loco(), "CQ_310_", true, new float[]{0F, 0.2F, 0F}, new float[]{0F, 0F, 180F}, null, "", 0, null, "", null, 0, false),
	Class162Engine(EntityElectricClass162.class, new ModelClass162Engine(), "Class_162_engine_", true, new float[]{-2F, 0.155F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Class162CoachB(EntityPassengerClass162CoachB.class, new ModelClass162CoachB(), "Class_162_Coach_B_", true, new float[]{0F, 0.155F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Class162CoachA(EntityPassengerClass162CoachA.class, new ModelClass162CoachA(), "Class_162_Coach_A_", true, new float[]{0F, 0.155F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Class162Tail(EntityPassengerClass162Tail.class, new ModelClass162Engine(), "Class_162_engine_", true, new float[]{0F, 0.155F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Class34(EntityLocoDieselClass34.class, new ModelClass34(), "class_34_", true, new float[]{-2.75F, 0.17F, 0F}, new float[]{0F, 180F, 180F}, null, "smoke", 3, new ArrayList<double[]>() {
	}, "", null, 0, false),
	tankerUK(EntityTankerUK.class, new ModelTankerUK(), "Tanker_UK_", true, new float[]{0F, 0.155F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	MetalTram(EntityLocoElectricMetalTram.class, new ModelMetalTram(), "Metal_Tram_", true, new float[]{-1F, 0.18F, 0.0F}, new float[]{0.0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	MetalTramCoach(EntityPassengerMetalTramCoach.class, new ModelMetalTramCoach(), "Metal_Tram_", true, new float[]{0.0F, 0.18F, 0.0F}, new float[]{0.0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	HopperUK(EntityFreightHopperUK.class, new ModelHopper_UK(), "Hopper_UK_", true, new float[]{0F, 0.1F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	B80C_A(EntityElectricB80C_A.class, new ModelB80C_A(), "B80C_", true, new float[]{-1.25F, 0.15F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	B80C_B(EntityPassengerB80C_B.class, new ModelB80C_B(), "B80C_", true, new float[]{-1.25F, 0.15F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	WoodenTramCoach(EntityPassengerWoodenTramCoach.class, new ModelWoodenTramCoach(), "Wooden_Tram_Coach_", true, new float[]{0.0F, 0.18F, 0.0F}, new float[]{0.0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	MA100_Loco(EntityElectricMA100_Loco.class, new ModelMA100_Loco(), "MA100_", true, new float[]{-0.95F, 0.16F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	MA100_Tail(EntityPassengerMA100_Tail.class, new ModelMA100_Tail(), "MA100_", true, new float[]{0F, 0.16F, 0F}, new float[]{0F, 0F, 180F}, null, "", 0, null, "", null, 0, false),
	ExpressFreightVan(EntityFreightExpressFreightVan.class, new ModelExpressFreightVan(), "Express_Freight_Van_", true, new float[]{0F, 0.1F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Class390Front(EntityElectricClass390.class, new ModelClass390Front(), "Class_390_Front_", true, new float[]{-2.3F, 0F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Class390Coach(EntityPassengerClass390Coach.class, new ModelClass390Coach(), "Class_390_Coach_", true, new float[]{0F, 0.F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Class390Panto(EntityPassengerClass390Panto.class, new ModelClass390Panto(), "Class_390_Panto_", true, new float[]{0F, 0.F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Class121Bubblecar(EntityLocoDieselClass121.class, new ModelClass121(), "bubble_car_", true, new float[]{-2.1F, 0.17F, 0F}, new float[]{0F, 180F, 180F}, null, "smoke", 3, new ArrayList<double[]>() {
	}, "", null, 0, false),
	Class121Trailer(EntityPassengerClass121Trailer.class, new ModelClass121Trailer(), "bubble_car_", true, new float[]{0F, 0.17F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Class117(EntityLocoDieselClass117.class, new ModelClass117(), "bubble_car_", true, new float[]{-2.1F, 0.17F, 0F}, new float[]{0F, 180F, 180F}, null, "smoke", 3, new ArrayList<double[]>() {
	}, "", null, 0, false),
	Class117Middle(EntityPassengerClass117Middle.class, new ModelClass117Middle(), "bubble_car_", true, new float[]{0F, 0.17F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	TipperUK(EntityFreightTipperUK.class, new ModelTipperUK(), "tipper_", true, new float[]{0F, 0.1F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	ShuntingTenderUK(EntityTenderShuntingTenderUK.class, new ModelShuntingTenderUK(), "shunting_tender_", true, new float[]{0f, 0.15f, 0f}, new float[]{0f, 180f, 180f}, null, "", 0, null, "", null, 0, false),
	BRBrakeVan(EntityCabooseBRBrakeVan.class, new ModelBRBrakeVan(), "br_brake_van_", true, new float[]{0F, 0.1F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),

	//TCCE7
	DuewagT4ER(EntityElectricDuewagT4ER.class, new ModelDuewagT4ER(), "Duewag_T4_", true, new float[]{-1.25F, 0.2F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	DuewagGT6ZRLoco(EntityElectricDuewagGT6ZRLoco.class, new ModelDuewagGT6ZRLoco(), "Duewag_GT6_", true, new float[]{-0.85F, 0.2F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	DuewagGT6ZTail(EntityPassengerDuewagGT6ZRTail.class, new ModelDuewagGT6ZRTail(), "Duewag_GT6_", true, new float[]{-0.85F, 0.2F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	M8CLoco(EntityElectricM8CLoco.class, new ModelM8CLoco(), "M8C_", true, new float[]{-1.1F, 0.2F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	M8CTail(EntityPassengerM8CTail.class, new ModelM8CTail(), "M8C_", true, new float[]{-1.1F, 0.2F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Class416Loco(EntityElectricClass416Loco.class, new ModelClass416Engine(), "Class_205_", true, new float[]{-2F, 0.15F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Class416Tail(EntityPassengerClass416Tail.class, new ModelClass416Tail(), "Class_205_", true, new float[]{0f, 0.15f, 0f}, new float[]{0F, 0F, 180F}, null, "", 0, null, "", null, 0, false),
	DB420Loco(EntityElectricDB420Loco.class, new ModelDB420End(), "db420_", true, new float[]{-1.5F, 0.18F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	DB420Middle(EntityPassengerDB420Middle.class, new ModelDB420Middle(), "db420_", true, new float[]{0F, 0.18F, 0F}, new float[]{0F, 0F, 180F}, null, "", 0, null, "", null, 0, false),
	DB420Tail(EntityPassengerDB420Tail.class, new ModelDB420End(), "db420_", true, new float[]{-1.5F, 0.18F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	CattleVan(EntityCattleVan.class, new ModelCattleVan(), "cattle_van", false, new float[]{0F, 0.15F, 0.0F}, new float[]{0F, 0F, 180F}, null, "", 0, null, "", null, 0, false),
	Class401Loco(EntityLocoElectricClass401.class, new ModelClass401Engine(), "2-bil_", true, new float[]{-1.7F, 0.17F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Class401Tail(EntityPassengerClass401Tail.class, new ModelClass401tail(), "2-bil_", true, new float[]{0.02F, 0.17F, 0F}, new float[]{0F, 0F, 180F}, null, "", 0, null, "", null, 0, false),
	passenger10tonBrakeVan(EntityPassenger10tonBrakeVan.class, new Model10tonBrakeVan(), "10ton_brakevan_", true, new float[]{0F, 0.15F, 0.0F}, new float[]{0F, 0F, 180F}, null, "", 0, null, "", null, 0, false),
	BR_MK2C_Coach(EntityPassengerBR_MK2C_Coach.class, new ModelBR_MK2C_Coach(), "BR_Mk2c_", true, new float[]{0.485F, 0F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	BR_MK2C_BSO(EntityPassengerBR_MK2C_BSO.class, new ModelBR_MK2C_BSO(), "BR_Mk2c_BSO_", true, new float[]{0.485F, 0F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Class230Engine(EntityElectricClass230.class, new ModelClass230(), "Class_230_", true, new float[]{-1.3F, 0.16F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Class230Middle(EntityClass230Middle.class, new ModelClass230Middle(), "Class_230_", true, new float[]{0F, 0.16F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	DuewagGT6ERLoco(EntityElectricDuewagGT6ERLoco.class, new ModelDuewagGT6ERLoco(), "Duewag_GT6ER_", true, new float[]{-0.85F, 0.2F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	DuewagGT6ERTail(EntityPassengerDuewagGT6ERTail.class, new ModelDuewagGT6ERTail(), "Duewag_GT6ER_", true, new float[]{-0.85F, 0.2F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Mineralwagon(EntityFreightMineralwagon.class, new ModelMineralwagon(), "Mineral_wagon_", true, new float[]{0f, 0.15f, 0f}, new float[]{0f, 180f, 180f}, null, "", 0, null, "", null, 0, false),
	VentilatedVan(EntityFreightVentilatedVan.class, new ModelVentilatedVan(), "Ventilated_van_", true, new float[]{0f, 0.15f, 0f}, new float[]{0f, 180f, 180f}, null, "", 0, null, "", null, 0, false),
	Class143Rear(EntityPassengerClass143.class, new ModelClass143(), "Class143_", true, new float[]{0F, 0.15F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Class143Middle(EntityPassengerClass143M.class, new ModelClass144(), "Class143_", true, new float[]{0F, 0.15F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Class374Front(EntityElectricClass374.class, new ModelClass374Front(), "Class_374_Front_", true, new float[]{-2.6F, 0.162F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Class374PremierPanto(EntityPassengerClass374PremierPanto.class, new ModelClass374PremierPanto(), "Class_374_Premier_Panto_", true, new float[]{0F, 0.162F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Class374StandardPanto(EntityPassengerClass374StandardPanto.class, new ModelClass374StandardPanto(), "Class_374_Standard_Panto_", true, new float[]{0F, 0.162F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Class374Buffet(EntityPassengerClass374Buffet.class, new ModelClass374Buffet(), "Class_374_Buffet_", true, new float[]{0F, 0.162F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Class387Front(EntityElectricClass387Front.class, new ModelClass387Front(), "Class_387_", true, new float[]{-2F, 0F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Class387Coach(EntityPassengerClass387Coach.class, new ModelClass387Coach(), "Class_387_Middle_", true, new float[]{0F, 0F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Class387Panto(EntityPassengerClass387Panto.class, new ModelClass387Panto(), "Class_387_Middle_", true, new float[]{0F, 0F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Class387Tail(EntityPassengerClass387Tail.class, new ModelClass387Front(), "Class_387_", true, new float[]{0F, 0F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Class378Front(EntityElectricClass378Front.class, new ModelClass378Front(), "Class_378_", true, new float[]{-1.9F, 0.2F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Class378Middle(EntityPassengerClass378Middle.class, new ModelClass378Middle(), "Class_378_Middle_", true, new float[]{0F, 0.2F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Class378Tail(EntityPassengerClass378Tail.class, new ModelClass378Front(), "Class_378_", true, new float[]{0F, 0.2F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Class142Front(EntityLocoDieselClass142.class, new ModelClass142(), "Class_142_", true, new float[]{-1.8F, 0.2F, 0F}, new float[]{0F, 180F, 180F}, null, "smoke", 2, new ArrayList<double[]>() {
	}, "", null, 0, false),
	Class142Tail(EntityPassengerClass142Tail.class, new ModelClass142(), "Class_142_", true, new float[]{-0.53F, 0.2F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Bagnall(EntityLocoDieselBagnall.class, new ModelBagnall(), "Bagnall_Shunter_0-4-0_", true, new float[]{-0.85F, 0.18F, 0F}, new float[]{0F, 180F, 180F}, null, "smoke", 2, new ArrayList<double[]>() {
	}, "", null, 0, false),
	Class389Front(EntityElectricClass389Front.class, new ModelClass389Front(), "Class_389_", true, new float[]{-2.4F, 0F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Class389Middle(EntityPassengerClass389Middle.class, new ModelClass389Middle(), "Class_389_Middle_", true, new float[]{-0.31F, 0F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Class389Tail(EntityPassengerClass389Tail.class, new ModelClass389Front(), "Class_389_", true, new float[]{-0.31F, 0F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Class442DTS(EntityElectricClass442DTS.class, new ModelClass442DTS(), "class_442_DTS_", true, new float[]{-2F, 0F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Class442TS(EntityPassengerClass442TS.class, new ModelClass442TS(), "class_442_TS_", true, new float[]{0.15F, 0F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Class442MBLS(EntityPassengerClass442MBLS.class, new ModelClass442MBLS(), "class_442_MBLS_", true, new float[]{0.15F, 0F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Class205loco(EntityLocoDieselClass205loco.class, new ModelClass205(), "Class_205_", true, new float[]{-2F, 0.15F, 0F}, new float[]{0F, 180F, 180F}, null, "smoke", 3, new ArrayList<double[]>() {
	}, "", null, 0, false),
	Class205tso(EntityPassengerClass205tso.class, new ModelClass205tso(), "Class_205_", true, new float[]{0f, 0.15f, 0f}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Class205tail(EntityPassengerClass205tail.class, new ModelClass205tail(), "Class_205_", true, new float[]{0f, 0.15f, 0f}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	M8DNF1Loco(EntityElectricM8DNF1Loco.class, new ModelM8DNF1End(), "m8d_nf1_", true, new float[]{-0.65F, 0.2F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	M8DNF1Middlelong(EntityPassengerM8DNF1MiddleLong.class, new ModelM8DNF1Middle1(), "m8d_nf1_", true, new float[]{0F, 0.2F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	M8DNF1Middleshort(EntityPassengerM8DNF1MiddleShort.class, new ModelM8DNF1Middle2(), "m8d_nf1_", true, new float[]{0F, 0.2F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	M8DNF1Tail(EntityPassengerM8DNF1Tail.class, new ModelM8DNF1End(), "m8d_nf1_", true, new float[]{-0.65F, 0.2F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	Class143Front(EntityLocoDieselClass143.class, new ModelClass143(), "Class143_", true, new float[]{-1f, 0.15f, 0f}, new float[]{0f, 180f, 180f}, null, "smoke", 1, new ArrayList<double[]>() {
		{
			add(new double[]{-0.8D, 1.25D, 0.4D});
		}
	}, "", null, 0, false),
	BoulderWagon(EntityBoulderWagon.class, new ModelBoulderWagon(), "BoulderWagon_", true, new float[]{0F, 0.2F, 0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	locoRW_Type_3(EntityLocoSteamRWType3.class, new ModelRW_Type_3(), "RW_Type_3_", true, new float[]{-1.25f, 0.17f, 0}, new float[]{0, 180, 180}, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[]{2.4D, 1.55D, 0D});
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[]{2.9D, 0.05D, 0.65D});
		}
	}, 2, true),

	locoRW_Type_2(EntityLocoSteamRWType2.class, new ModelRW_Type_2(), "Type_2_", true, new float[]{-1.25f, 0.17f, 0}, new float[]{0, 180, 180}, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[]{2.2D, 1.55D, 0D});
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[]{2.6D, 0.05D, 0.65D});
		}
	}, 2, true),


	locoGWR_101_Class(EntityLocoSteamGWR101Class.class, new ModelGWR101Class(), "Gwr_101_", true, new float[]{-1.25f, 0.17f, 0}, new float[]{0, 180, 180}, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[]{2.6D, 1.55D, 0D});
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[]{3D, 0.05D, 0.65D});
		}
	}, 2, true),


	locoGWR_42xx(EntityLocoSteamGWR42xx.class, new ModelGWR42xx(), "2-8-0_", true, new float[]{-2.1f, 0.17f, 0}, new float[]{0, 180, 180}, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[]{4.1D, 1.6D, 0D});
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[]{4.3D, 0.05D, 0.65D});
		}
	}, 2, true),

	locoGWR_72xx(EntityLocoSteamGWR72xx.class, new ModelGWR72xx(), "72xx_", true, new float[]{-2.5f, 0.17f, 0}, new float[]{0, 180, 180}, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[]{4.8D, 1.6D, 0D});
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[]{5.0D, 0.05D, 0.65D});
		}
	}, 2, true),

	locoWWCP_Class_062T(EntityLocoSteamWWCPClass062T.class, new ModelWWCPClass062T(), "WWCP_Standard_0-6-2T_", true, new float[]{-2.5f, 0.17f, 0}, new float[]{0, 180, 180}, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[]{4.3D, 1.6D, 0D});
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[]{4.6D, 0.05D, 0.65D});
		}
	}, 2, true),

	locoBR_Britannia_Class(EntityLocoSteamBR_Britannia_Class.class, new ModelBR_Britannia_Class(), "BR_Britannia_", true, new float[]{-2.3f, -0.05f, 0}, new float[]{0, 180, 180}, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[]{3.78D, 1.4D, 0D});
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[]{4.1D, 0.05D, 0.65D});
		}
	}, 2, true),

	locoJ50(EntityLocoSteamJ50.class, new ModelJ50(), "J50_", true, new float[]{-1.25f, 0.15f, 0}, new float[]{0, 180, 180}, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[]{2.7D, 1.5D, 0D});
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[]{2.8D, 0.05D, 0.65D});
		}
	}, 2, true),

	locoSentinelY3(EntityLocoSteamSentinelY3.class, new ModelSentinelY3(), "Sentinel_Y3_", true, new float[]{-0.5f, 0.15f, 0}, new float[]{0, 180, 180}, null, "largesmoke", 2, new ArrayList<double[]>() {
		{
			add(new double[]{-0.5D, 1.5D, 0D});
		}
	}, "explode", new ArrayList<double[]>() {
		{

		}
	}, 2, true),

	locoJacknail(EntitylocoSteamJacknail.class, new ModelMWClass88BTE(), "0-8-0_box_tank_", true, new float[]{-1.25f, 0.15f, 0}, new float[]{0, 180, 180}, null, "largesmoke", 2, new ArrayList<double[]>() {
		{
			add(new double[]{2.5D, 1.5D, 0D});
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[]{2.5D, 0.05D, 0.65D});
		}
	}, 2, true),

	LocoMRcompoundTender(EntityTenderMRCompound.class, new ModelMRCompoundTender(), "LMS_4p_", true, new float[]{0f, 0.15f, 0}, new float[]{0, 180, 180}, null, "", 0, null, "", null, 0, false),
	locoMRcompound(EntitylocoSteamMRCompound.class, new ModelMidlandcompound(), "LMS_4p_", true, new float[]{-1.55f, 0.15f, 0}, new float[]{0, 180, 180}, null, "largesmoke", 2, new ArrayList<double[]>() {
		{
			add(new double[]{3.5D, 1.5D, 0D});
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[]{3.5D, 0.05D, 0.65D});
		}
	}, 2, true),
	;
	private Class<? extends EntityRollingStock> entityClass;
	private final ModelBase model;
	private String texture;
	private boolean multiTexture;
	private float[] trans;
	private float[] rotate;
	private float[] scale;
	private String smokeType;
	private ArrayList<double[]> smokeFX;
	private String explosionType;
	private ArrayList<double[]> explosionFX;
	private int smokeIterations;
	private int explosionFXIterations;
	private boolean hasSmokeOnSlopes;

	/**
	 * Defines the render @param for a RollingStock
	 *
	 * @param model ModelBase
	 * @param texture String
	 * @param multiTexture boolean
	 * @param trans float[]
	 * @param rotate float[]
	 * @param scale float[]
	 * @param smokeType String
	 * @param smokeFX ArrayList
	 * @param explosionType String
	 * @param explosionFX ArrayList
	 */
	TCCERenderEnum(Class<? extends EntityRollingStock> entityClass, ModelBase model, String texture, boolean multiTexture, float[] trans, float[] rotate, float[] scale, String smokeType, int smokeIterations, ArrayList<double[]> smokeFX, String explosionType, ArrayList<double[]> explosionFX, int explosionFXIterations, boolean hasSmokeOnSlopes) {
		this.entityClass = entityClass;
		this.model = model;
		this.texture = texture;
		this.multiTexture = multiTexture;
		this.trans = trans;
		this.rotate = rotate;
		this.scale = scale;
		this.smokeType = smokeType;
		this.smokeFX = smokeFX;
		this.explosionType = explosionType;
		this.explosionFX = explosionFX;
		this.smokeIterations = smokeIterations;
		this.explosionFXIterations = explosionFXIterations;
		this.hasSmokeOnSlopes = hasSmokeOnSlopes;
	}

    @Override
	public Class<? extends EntityRollingStock> getEntityClass() {
		return entityClass;
	}

    @Override
	public ModelBase getModel() {
		return model;
	}

	public boolean getIsMultiTextured() {
		return multiTexture;
	}

    @Override
	public boolean hasSmoke() {
		return smokeType.length() > 0;
	}

    @Override
	public boolean hasSmokeOnSlopes() {
		return hasSmokeOnSlopes;
	}

    @Override
	public String getSmokeType() {
		return smokeType;
	}

    @Override
	public ArrayList<double[]> getSmokeFX() {
		return smokeFX;
	}

    @Override
	public String getExplosionType() {
		return explosionType;
	}

    @Override
	public boolean hasExplosion() {
		return explosionType.length() > 0;
	}

    @Override
	public ArrayList<double[]> getExplosionFX() {
		return explosionFX;
	}

    @Override
	public float[] getTrans() {
		return trans;
	}

    @Override
	public float[] getRotate() {
		return rotate;
	}

    @Override
	public float[] getScale() {
		return scale;
	}

    @Override
    public ResourceLocation getTextureFile(String colorString) {
		if (multiTexture) {
			return new ResourceLocation(TCCEInfo.resourceLocation, TCCEInfo.trainsPrefix + texture + colorString + ".png");
		} else {
			return new ResourceLocation(TCCEInfo.resourceLocation, TCCEInfo.trainsPrefix + texture + ".png");
		}
	}

    @Override
	public int getSmokeIterations() {
		return smokeIterations;
	}

    @Override
	public int getExplosionFXIterations() {
		return explosionFXIterations;
	}
}
