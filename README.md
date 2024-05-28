# BKUC-Indium---DEC
Reversal of BKUC Indium android roblox executor
https://www.virustotal.com/gui/file/29c3da5763a07743540d5efe4fd06b6a3f8741e8ec46c9244fca838cd998b2fc

Overall it seems benign

The two detections in virustotal are due to the apk being signed by android studio with test keys rather than proper production keys which isn't a big deal.

if you take a look at the two Quixxi scans in the pdf files INDIUM.pdf and ROBLOX.pdf you can see a comparison between this roblox client and the official roblox client. You will see there are 2 more vulnerabilities present in the Indium one which matches the virustotal scan and is probably due to the same reasons. Although it should be taken into account that Indium is a slightly older package version and roblox may have simply patched 2 vulns in that time.

Looking through the code the worst thing that i found was some analytics stuff which is probably from roblox itself and some support for remote debugging which is kind of questionable but ehh.

debugging/profiling analysis pending.
