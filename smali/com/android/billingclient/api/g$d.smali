.class public final Lcom/android/billingclient/api/g$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/billingclient/api/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Lcom/android/billingclient/api/g$c;

.field private final e:Ljava/util/List;

.field private final f:Lcom/android/billingclient/api/t;


# direct methods
.method constructor <init>(Lorg/json/JSONObject;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "basePlanId"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/android/billingclient/api/g$d;->a:Ljava/lang/String;

    const-string v0, "offerId"

    .line 2
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v3, v1, :cond_0

    move-object v0, v2

    :cond_0
    iput-object v0, p0, Lcom/android/billingclient/api/g$d;->b:Ljava/lang/String;

    const-string v0, "offerIdToken"

    .line 4
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/android/billingclient/api/g$d;->c:Ljava/lang/String;

    new-instance v0, Lcom/android/billingclient/api/g$c;

    const-string v1, "pricingPhases"

    .line 5
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/android/billingclient/api/g$c;-><init>(Lorg/json/JSONArray;)V

    iput-object v0, p0, Lcom/android/billingclient/api/g$d;->d:Lcom/android/billingclient/api/g$c;

    const-string v0, "installmentPlanDetails"

    .line 6
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 7
    :cond_1
    new-instance v2, Lcom/android/billingclient/api/t;

    .line 8
    invoke-direct {v2, v0}, Lcom/android/billingclient/api/t;-><init>(Lorg/json/JSONObject;)V

    .line 9
    :goto_0
    iput-object v2, p0, Lcom/android/billingclient/api/g$d;->f:Lcom/android/billingclient/api/t;

    new-instance v0, Ljava/util/ArrayList;

    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const-string v1, "offerTags"

    .line 11
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    if-eqz p1, :cond_2

    const/4 v1, 0x0

    .line 12
    :goto_1
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 13
    invoke-virtual {p1, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    iput-object v0, p0, Lcom/android/billingclient/api/g$d;->e:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/android/billingclient/api/g$d;->c:Ljava/lang/String;

    return-object v0
.end method

.method public b()Lcom/android/billingclient/api/g$c;
    .locals 1

    iget-object v0, p0, Lcom/android/billingclient/api/g$d;->d:Lcom/android/billingclient/api/g$c;

    return-object v0
.end method
