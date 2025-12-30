package data.missions.BetterDA_destroyers;

import com.fs.starfarer.api.Global;
import com.fs.starfarer.api.fleet.FleetGoal;
import com.fs.starfarer.api.fleet.FleetMemberType;
import com.fs.starfarer.api.mission.FleetSide;
import com.fs.starfarer.api.mission.MissionDefinitionAPI;
import com.fs.starfarer.api.mission.MissionDefinitionPlugin;

public class MissionDefinition implements MissionDefinitionPlugin {
    @Override
	public void defineMission(MissionDefinitionAPI api) {

	
		// Set up the fleets so we can add ships and fighter wings to them.
		// In this scenario, the fleets are attacking each other, but
		// in other scenarios, a fleet may be defending or trying to escape
		api.initFleet(FleetSide.PLAYER, "CESN", FleetGoal.ATTACK, true);
		api.initFleet(FleetSide.ENEMY, "DSF", FleetGoal.ATTACK, true);

		// Set a small blurb for each fleet that shows up on the mission detail and
		// mission results screens to identify each side.
		api.setFleetTagline(FleetSide.PLAYER, "New Variants");
		api.setFleetTagline(FleetSide.ENEMY, "Old Variants");
		
		// These show up as items in the bulleted list under 
		// "Tactical Objectives" on the mission detail screen
		//api.addBriefingItem("The CESN Railjack Must Survive.");
		api.addBriefingItem("Showcase of Better Variants");
		
		// Set up the player's fleet.  Variant names come from the
		// files in data/variants and data/variants/fighters
				
				//player Flagship
				api.addToFleet(FleetSide.PLAYER, "corvid_coldfront_Flagship", FleetMemberType.SHIP, true);
				//Calm Variants
				api.addToFleet(FleetSide.PLAYER, "corvid_calm_Assault", FleetMemberType.SHIP, false);
                api.addToFleet(FleetSide.PLAYER, "corvid_calm_Close_Quarter", FleetMemberType.SHIP, false);
                api.addToFleet(FleetSide.PLAYER, "corvid_calm_Mixed", FleetMemberType.SHIP, false);
				api.addToFleet(FleetSide.PLAYER, "corvid_calm_Standard", FleetMemberType.SHIP, false);
				api.addToFleet(FleetSide.PLAYER, "corvid_calm_Supressor", FleetMemberType.SHIP, false);
				//Hayle Variants
				api.addToFleet(FleetSide.PLAYER, "corvid_hayle_Close_Quarter", FleetMemberType.SHIP, false);
                api.addToFleet(FleetSide.PLAYER, "corvid_hayle_Combat", FleetMemberType.SHIP, false);
                api.addToFleet(FleetSide.PLAYER, "corvid_hayle_Multirole", FleetMemberType.SHIP, false);
				api.addToFleet(FleetSide.PLAYER, "corvid_hayle_Standard", FleetMemberType.SHIP, false);
				//miniGust Variants
				api.addToFleet(FleetSide.PLAYER, "corvid_miniGust_Assault", FleetMemberType.SHIP, false);
                api.addToFleet(FleetSide.PLAYER, "corvid_miniGust_Beamer", FleetMemberType.SHIP, false);
                api.addToFleet(FleetSide.PLAYER, "corvid_miniGust_Close_Support", FleetMemberType.SHIP, false);
				api.addToFleet(FleetSide.PLAYER, "corvid_miniGust_Support", FleetMemberType.SHIP, false);
				//PolarV Variants
				api.addToFleet(FleetSide.PLAYER, "corvid_polarV_Assault", FleetMemberType.SHIP, false);
                api.addToFleet(FleetSide.PLAYER, "corvid_polarV_Escort", FleetMemberType.SHIP, false);
                api.addToFleet(FleetSide.PLAYER, "corvid_polarV_Support", FleetMemberType.SHIP, false);
				//Coanda Variants
				api.addToFleet(FleetSide.PLAYER, "corvid_coanda_Assault", FleetMemberType.SHIP, false);
                api.addToFleet(FleetSide.PLAYER, "corvid_coanda_Standard", FleetMemberType.SHIP, false);
				//Fractus Variants
				api.addToFleet(FleetSide.PLAYER, "corvid_fractus_Attack", FleetMemberType.SHIP, false);
                api.addToFleet(FleetSide.PLAYER, "corvid_fractus_Escort", FleetMemberType.SHIP, false);
                api.addToFleet(FleetSide.PLAYER, "corvid_fractus_Standard", FleetMemberType.SHIP, false);
				api.addToFleet(FleetSide.PLAYER, "corvid_fractus_Support", FleetMemberType.SHIP, false);
				//Derecho Variants
				api.addToFleet(FleetSide.PLAYER, "corvid_derecho_Kite", FleetMemberType.SHIP, false);
                api.addToFleet(FleetSide.PLAYER, "corvid_derecho_Standard", FleetMemberType.SHIP, false);
                api.addToFleet(FleetSide.PLAYER, "corvid_derecho_Support", FleetMemberType.SHIP, false);
				//Logistics Variants
				api.addToFleet(FleetSide.PLAYER, "corvid_chinook_Logistic", FleetMemberType.SHIP, false);
                api.addToFleet(FleetSide.PLAYER, "corvid_cirrus_Logistic", FleetMemberType.SHIP, false);
				api.addToFleet(FleetSide.PLAYER, "corvid_stratus_Logistic", FleetMemberType.SHIP, false);
  
		// Mark both ships as essential - losing either one results
		// in mission failure. Could also be set on an enemy ship,
		// in which case destroying it would result in a win.
		// api.defeatOnShipLoss("CESN Railjack");
		
		// Set up the enemy fleet.
		//api.addToFleet(FleetSide.ENEMY, "eagle_Assault", FleetMemberType.SHIP, false);		
		//api.addToFleet(FleetSide.ENEMY, "onslaught_Outdated", FleetMemberType.SHIP, false);
		        
				//Test Fleet
				//api.addToFleet(FleetSide.ENEMY, "sunder_Flagship", FleetMemberType.SHIP, true);
                //api.addToFleet(FleetSide.ENEMY, "condor_Support", FleetMemberType.SHIP, false);
				//api.addToFleet(FleetSide.ENEMY, "condor_Support", FleetMemberType.SHIP, false);				               
                //api.addToFleet(FleetSide.ENEMY, "brawler_Assault", FleetMemberType.SHIP, false);	
                //api.addToFleet(FleetSide.ENEMY, "brawler_Assault", FleetMemberType.SHIP, false);	            
                //api.addToFleet(FleetSide.ENEMY, "brawler_Assault", FleetMemberType.SHIP, false);
				
        //Old Calm Variants
		api.addToFleet(FleetSide.ENEMY, "diableavionics_calm_assault", FleetMemberType.SHIP, false);
        api.addToFleet(FleetSide.ENEMY, "diableavionics_calm_brute", FleetMemberType.SHIP, false);
        api.addToFleet(FleetSide.ENEMY, "diableavionics_calm_closequarter", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.ENEMY, "diableavionics_calm_mixed", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.ENEMY, "diableavionics_calm_standard", FleetMemberType.SHIP, false);
		//Old Hayle Variants
		//api.addToFleet(FleetSide.ENEMY, "diableavionics_hayle_attack", FleetMemberType.SHIP, false);
        api.addToFleet(FleetSide.ENEMY, "diableavionics_hayle_closequarter", FleetMemberType.SHIP, false);
        api.addToFleet(FleetSide.ENEMY, "diableavionics_hayle_combat", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.ENEMY, "diableavionics_hayle_multirole", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.ENEMY, "diableavionics_hayle_standard", FleetMemberType.SHIP, false);
		//Old miniGust Variants
		api.addToFleet(FleetSide.ENEMY, "diableavionics_miniGust_assault", FleetMemberType.SHIP, false);
        api.addToFleet(FleetSide.ENEMY, "diableavionics_miniGust_beamer", FleetMemberType.SHIP, false);
        api.addToFleet(FleetSide.ENEMY, "diableavionics_miniGust_closeSupport", FleetMemberType.SHIP, false);
		//api.addToFleet(FleetSide.ENEMY, "diableavionics_miniGust_pd", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.ENEMY, "diableavionics_miniGust_support", FleetMemberType.SHIP, false);
		//Old PolarV Variants
		api.addToFleet(FleetSide.ENEMY, "diable_polarV_assault", FleetMemberType.SHIP, false);
        api.addToFleet(FleetSide.ENEMY, "diable_polarV_escort", FleetMemberType.SHIP, false);
        api.addToFleet(FleetSide.ENEMY, "diable_polarV_support", FleetMemberType.SHIP, false);
		//Old Coanda Variants
		api.addToFleet(FleetSide.ENEMY, "diableavionics_coanda_assault", FleetMemberType.SHIP, false);
        api.addToFleet(FleetSide.ENEMY, "diableavionics_coanda_standard", FleetMemberType.SHIP, false);
        //api.addToFleet(FleetSide.ENEMY, "diableavionics_coanda_support", FleetMemberType.SHIP, false);
		//Old Fractus Variants
		//api.addToFleet(FleetSide.ENEMY, "diableavionics_fractus_antiFighter", FleetMemberType.SHIP, false);
        api.addToFleet(FleetSide.ENEMY, "diableavionics_fractus_attack", FleetMemberType.SHIP, false);
        api.addToFleet(FleetSide.ENEMY, "diableavionics_fractus_escort", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.ENEMY, "diableavionics_fractus_standard", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.ENEMY, "diableavionics_fractus_support", FleetMemberType.SHIP, false);
		//Old Derecho Variants
		api.addToFleet(FleetSide.ENEMY, "corvid_derecho_Kite", FleetMemberType.SHIP, false);
        api.addToFleet(FleetSide.ENEMY, "corvid_derecho_Standard", FleetMemberType.SHIP, false);
        api.addToFleet(FleetSide.ENEMY, "corvid_derecho_Support", FleetMemberType.SHIP, false);
		//Old Logistics Variants
		api.addToFleet(FleetSide.ENEMY, "diableavionics_chinook_standard", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.ENEMY, "diableavionics_chinook_support", FleetMemberType.SHIP, false);
        api.addToFleet(FleetSide.ENEMY, "diableavionics_cirrus_assault", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.ENEMY, "diableavionics_cirrus_standard", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.ENEMY, "diableavionics_stratus_combat", FleetMemberType.SHIP, false);

		// Set up the map.
		float width = 24000f;
		float height = 14000f;
		api.initMap((float)-width/2f, (float)width/2f, (float)-height/2f, (float)height/2f);
		
		float minX = -width/2;
		float minY = -height/2;
		
		// All the addXXX methods take a pair of coordinates followed by data for
		// whatever object is being added.
		
		// Add two big nebula clouds
		api.addNebula(minX + width * 0.75f, minY + height * 0.5f, 2000);
		api.addNebula(minX + width * 0.25f, minY + height * 0.5f, 1000);
		
		// And a few random ones to spice up the playing field.
		// A similar approach can be used to randomize everything
		// else, including fleet composition.
		for (int i = 0; i < 5; i++) {
			float x = (float) Math.random() * width - width/2;
			float y = (float) Math.random() * height - height/2;
			float radius = 100f + (float) Math.random() * 400f; 
			api.addNebula(x, y, radius);
		}
		
		// Add objectives. These can be captured by each side
		// and provide stat bonuses and extra command points to
		// bring in reinforcements.
		// Reinforcements only matter for large fleets - in this
		// case, assuming a 100 command point battle size,
		// both fleets will be able to deploy fully right away.
		api.addObjective(minX + width * 0.25f + 3000, minY + height * 0.5f, 
						 "nav_buoy");
		api.addObjective(minX + width * 0.75f - 3000, minY + height * 0.5f, 
						 "sensor_array");
	}

}
