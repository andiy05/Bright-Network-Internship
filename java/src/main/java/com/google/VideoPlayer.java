package com.google;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class VideoPlayer {
	ArrayList<String> arr = new ArrayList<String>();
  public int count=0;
public boolean flag = false;

  public VideoPlayer() {
    this.videoLibrary = new VideoLibrary();
  }

  public void numberOfVideos() {
    System.out.printf("%s videos in the library%n", videoLibrary.getVideos().size());
  }

  public void showAllVideos() {
	  for(int i = 0; i < videoLibrary.getVideos().size(); i++)
		    System.out.println(videoLibrary.getVideos().get(i).getTitle()+"("+videoLibrary.getVideos().get(i).getVideoId()+")"+videoLibrary.getVideos().get(i).getTags());
  }

  public void playVideo(String videoId) {
	  if(arr.size() > 0) {
	      System.out.println("Stopping Video  : " + arr.get(0));
	      arr.remove(0);
	      arr.add(videoLibrary.getVideo(videoId).getTitle());
	    } else {
	      arr.add(videoLibrary.getVideo(videoId).getTitle());
	    }
	    System.out.println("Playing video  : " + videoLibrary.getVideo(videoId).getTitle());
  }

  public void stopVideo() {
	  String videoId = videoLibrary.getVideos().get(0).getVideoId();
	    Video video = videoLibrary.getVideo(videoId);
	    if (video == null) {
	      System.out.println("Cannot play video: Video does not exist");
	    }
	    else if(arr.size() > 0) {
	      System.out.println("Stopping Video  : " + arr.get(0));
	      arr.remove(0);
	    }else {
	      System.out.println("Cannot play video: Video does not exist");

	    }
  }

  public void playRandomVideo() {
	  
	  var vids = videoLibrary.getVideos();
	  ArrayList<String> ID = new ArrayList<String>();

	  for (Video vid: vids) {
	  ID.add(((Video) vid).getVideoId());
	  }

	  Random rand = new Random();
	  String randomElement = ID.get(rand.nextInt(ID.size()));
	  playvide(randomElement);
  }

  private void playvide(String randomElement) {
	  if(arr.size() > 0) {
	      System.out.println("Stopping Video  : " + arr.get(0));
	      arr.remove(0);
	      arr.add(videoLibrary.getVideo(randomElement).getTitle());
	    } else {
	      arr.add(videoLibrary.getVideo(randomElement).getTitle());
	    }
	    System.out.println("Playing video  : " + videoLibrary.getVideo(randomElement).getTitle());
	
}

public void pauseVideo() {
	  if((arr.size()>0)&&(count>0))
	    {
	      System.out.println("Video already paused:"+arr.get(0));
	      return;
	    }
	    if(arr.size()>0)
	    {
	      System.out.println("Pausing video: "+arr.get(0));
	      count++;
	      return;
	    }
  }

  public void continueVideo() {
	  if((count==0)&&(flag==false))
	     {
	       System.out.println("Cannot continue video: Video is not paused");
	     }
	     else if((count>0)&&(flag==false))
	     {
	       System.out.println("Continuing video: "+arr.get(0));
	       flag = true;
	     }
	     else if((count>0)&&(flag==true))
	     {
	       System.out.println("Cannot continue video: Video is not paused");
	     }
	     else
	     {
	       System.out.println("Cannot continue video: No video is currently playing");
	     }
  }

  public void showPlaying() {
	    }
    public void createPlaylist(String playlistName) {
	    }

  public void addVideoToPlaylist(String playlistName, String videoId) {
	    }

  public void showAllPlaylists() {
    System.out.println("showAllPlaylists needs implementation");
  }

  public void showPlaylist(String playlistName) {
    System.out.println("showPlaylist needs implementation");
  }

  public void removeFromPlaylist(String playlistName, String videoId) {
    System.out.println("removeFromPlaylist needs implementation");
  }

  public void clearPlaylist(String playlistName) {
    System.out.println("clearPlaylist needs implementation");
  }

  public void deletePlaylist(String playlistName) {
    System.out.println("deletePlaylist needs implementation");
  }

  public void searchVideos(String searchTerm) {
    System.out.println("searchVideos needs implementation");
  }

  public void searchVideosWithTag(String videoTag) {
    System.out.println("searchVideosWithTag needs implementation");
  }

  public void flagVideo(String videoId) {
    System.out.println("flagVideo needs implementation");
  }

  public void flagVideo(String videoId, String reason) {
    System.out.println("flagVideo needs implementation");
  }

  public void allowVideo(String videoId) {
    System.out.println("allowVideo needs implementation");
  }
}