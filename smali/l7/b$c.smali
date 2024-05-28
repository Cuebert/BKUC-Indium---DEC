.class Ll7/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/b$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll7/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Ll7/b;


# direct methods
.method private constructor <init>(Ll7/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ll7/b$c;->a:Ll7/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Ll7/b;Ll7/b$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Ll7/b$c;-><init>(Ll7/b;)V

    return-void
.end method


# virtual methods
.method public a(Ll9/a;)V
    .locals 9

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    invoke-virtual {p1}, Ll9/a;->f()Lorg/json/JSONObject;

    move-result-object v1

    const-wide/16 v2, -0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    const-string v5, "params"

    .line 3
    invoke-virtual {v1, v5}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_1

    const-string v5, "userIds"

    .line 4
    invoke-virtual {v1, v5}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    const/4 v5, 0x0

    .line 5
    :goto_0
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v6

    if-ge v5, v6, :cond_1

    .line 6
    invoke-virtual {v1, v5, v2, v3}, Lorg/json/JSONArray;->optLong(IJ)J

    move-result-wide v6

    cmp-long v8, v6, v2

    if-eqz v8, :cond_0

    .line 7
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 8
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v5, 0x0

    if-lez v1, :cond_2

    .line 9
    new-instance v1, La7/h;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    invoke-direct {v1, v2, v3, v6, v7}, La7/h;-><init>(JJ)V

    .line 10
    invoke-static {}, Lbc/c;->d()Lbc/c;

    move-result-object v0

    invoke-virtual {v0, v1}, Lbc/c;->j(Ljava/lang/Object;)V

    const/4 v0, 0x1

    .line 11
    invoke-virtual {p1, v0, v5}, Ll9/a;->a(ZLorg/json/JSONObject;)V

    goto :goto_1

    .line 12
    :cond_2
    invoke-virtual {p1, v4, v5}, Ll9/a;->a(ZLorg/json/JSONObject;)V

    :goto_1
    return-void
.end method
