.class public Lf7/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:J

.field public c:J

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:J

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public j:Ljava/lang/String;

.field public k:Ljava/lang/String;

.field public l:Ljava/lang/String;

.field public m:Ljava/lang/String;

.field public n:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lf7/c0;->a:I

    const-wide/16 v0, 0x0

    .line 3
    iput-wide v0, p0, Lf7/c0;->b:J

    .line 4
    iput-wide v0, p0, Lf7/c0;->c:J

    const-string v2, ""

    .line 5
    iput-object v2, p0, Lf7/c0;->d:Ljava/lang/String;

    .line 6
    iput-object v2, p0, Lf7/c0;->e:Ljava/lang/String;

    .line 7
    iput-object v2, p0, Lf7/c0;->f:Ljava/lang/String;

    .line 8
    iput-wide v0, p0, Lf7/c0;->g:J

    .line 9
    iput-object v2, p0, Lf7/c0;->h:Ljava/lang/String;

    .line 10
    iput-object v2, p0, Lf7/c0;->i:Ljava/lang/String;

    .line 11
    iput-object v2, p0, Lf7/c0;->j:Ljava/lang/String;

    .line 12
    iput-object v2, p0, Lf7/c0;->k:Ljava/lang/String;

    .line 13
    iput-object v2, p0, Lf7/c0;->l:Ljava/lang/String;

    .line 14
    iput-object v2, p0, Lf7/c0;->m:Ljava/lang/String;

    .line 15
    iput-object v2, p0, Lf7/c0;->n:Ljava/lang/String;

    const-string v2, "roblox_placeId"

    .line 16
    invoke-virtual {p1, v2, v0, v1}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v2

    iput-wide v2, p0, Lf7/c0;->c:J

    const-string v2, "roblox_accessCode"

    .line 17
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lf7/c0;->d:Ljava/lang/String;

    const-string v2, "roblox_linkCode"

    .line 18
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lf7/c0;->e:Ljava/lang/String;

    const-string v2, "roblox_gameId"

    .line 19
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lf7/c0;->f:Ljava/lang/String;

    const-string v2, "roblox_userId"

    .line 20
    invoke-virtual {p1, v2, v0, v1}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v2

    iput-wide v2, p0, Lf7/c0;->b:J

    const-string v2, "roblox_conversationId"

    .line 21
    invoke-virtual {p1, v2, v0, v1}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lf7/c0;->g:J

    const-string v0, "roblox_reservedServerAccessCode"

    .line 22
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lf7/c0;->h:Ljava/lang/String;

    const-string v0, "roblox_callId"

    .line 23
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lf7/c0;->i:Ljava/lang/String;

    const-string v0, "roblox_joinRequestType"

    const/4 v1, -0x1

    .line 24
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lf7/c0;->a:I

    const-string v0, "roblox_referralPage"

    .line 25
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lf7/c0;->j:Ljava/lang/String;

    const-string v0, "roblox_launchData"

    .line 26
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lf7/c0;->k:Ljava/lang/String;

    const-string v0, "roblox_joinAttemptId"

    .line 27
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lf7/c0;->l:Ljava/lang/String;

    const-string v0, "roblox_joinAttemptOrigin"

    .line 28
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lf7/c0;->m:Ljava/lang/String;

    const-string v0, "roblox_isoContext"

    .line 29
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lf7/c0;->n:Ljava/lang/String;

    return-void
.end method
