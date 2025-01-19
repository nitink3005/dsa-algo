## design-youtube
<p>tags : 

## Understanding the problem
Youtube is a video-sharing platform that allows user to upload, view and interact with video content.

## Functional Requirements
### Core Requirements
- Users can upload videos
- Users can watch(stream) videos

### Out of scope
- Users can search for videos
- Users can comment on videos
- Users can see recommended videos
- User can make a channel and manage their channel
- Users can subscribe to channel

## Non Functional Requirements
- System should be highly availaible.
- System should support uploading and streaming of videos.
- System should allow low latency streaming of videos even in low bandwidth environments.
- System should scale to high number of video uploaded and watched per day.
- System should support resumable uploads.

## The APIs
- Uploading of videos
POST /upload 
    {
        video,
        videoMetaData
    }

- Streaming of videos
GET /video/{videoId} -> video and videoMetaData

## Design Deep Dive
-- continued..



## Diagram

## Refs
- https://howvideo.works/