.class Lh8/s$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh8/s$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh8/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lh8/s;


# direct methods
.method constructor <init>(Lh8/s;)V
    .locals 0

    iput-object p1, p0, Lh8/s$a;->a:Lh8/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lj8/j;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lh8/j;)V
    .locals 7

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p1}, Lj8/j;->a()Lorg/json/JSONObject;

    move-result-object p1

    .line 2
    :try_start_0
    invoke-virtual {p5, p1, p2}, Lh8/j;->d(Lorg/json/JSONObject;Landroid/content/Context;)V

    const-string v0, "onMetadataRetrieved"

    const-string p2, "type"

    .line 3
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string p2, "notificationId"

    .line 4
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v5, "0"

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    move-object v1, p3

    move-object v4, p4

    .line 5
    invoke-static/range {v0 .. v6}, Lcom/roblox/client/f0;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 6
    invoke-virtual {p1}, Lorg/json/JSONException;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method
