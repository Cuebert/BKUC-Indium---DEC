.class public Lq7/e;
.super Lq7/f;
.source "SourceFile"


# instance fields
.field private final F:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lq7/f;-><init>()V

    .line 2
    iput-wide p1, p0, Lq7/e;->F:J

    return-void
.end method


# virtual methods
.method public n()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    iget-wide v0, p0, Lq7/e;->F:J

    invoke-static {v0, v1}, Lcom/roblox/client/p0;->W(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    .line 2
    invoke-static {v0, v1, v1}, Lh7/b;->i(Ljava/lang/String;Ljava/lang/String;[Lh7/b$a;)Lh7/j;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lh7/j;->a()Ljava/lang/String;

    move-result-object v0

    .line 4
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 5
    new-instance v0, Lt6/a;

    const-string v3, "id"

    const-wide/16 v4, -0x1

    invoke-virtual {v2, v3, v4, v5}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v3

    const-string v5, "displayName"

    invoke-virtual {v2, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v3, v4, v2}, Lt6/a;-><init>(JLjava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v1, v0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 6
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    :goto_0
    if-eqz v1, :cond_0

    .line 7
    invoke-static {}, Lt6/b;->b()Lt6/b;

    move-result-object v0

    invoke-virtual {v0, v1}, Lt6/b;->e(Lt6/a;)V

    .line 8
    new-instance v0, Lq7/c;

    iget-wide v2, p0, Lq7/e;->F:J

    invoke-direct {v0, v2, v3}, Lq7/c;-><init>(J)V

    .line 9
    invoke-static {}, Lx7/f;->b()Lcom/birbit/android/jobqueue/g;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/birbit/android/jobqueue/g;->c(Lcom/birbit/android/jobqueue/e;)V

    .line 10
    invoke-static {}, Lbc/c;->d()Lbc/c;

    move-result-object v0

    new-instance v2, La7/n;

    invoke-virtual {v1}, Lt6/a;->b()J

    move-result-wide v3

    invoke-direct {v2, v3, v4}, La7/n;-><init>(J)V

    invoke-virtual {v0, v2}, Lbc/c;->j(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method protected w(Lq7/f$a;)V
    .locals 0

    return-void
.end method
