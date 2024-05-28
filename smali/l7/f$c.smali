.class Ll7/f$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/b$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll7/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Ll7/f;


# direct methods
.method private constructor <init>(Ll7/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ll7/f$c;->a:Ll7/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Ll7/f;Ll7/f$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Ll7/f$c;-><init>(Ll7/f;)V

    return-void
.end method


# virtual methods
.method public a(Ll9/a;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ll9/a;->f()Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_0

    const-wide/16 v1, -0x1

    const-string v3, "userId"

    .line 2
    invoke-virtual {v0, v3, v1, v2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v0

    .line 3
    new-instance v2, La7/i;

    const-string v3, "PROFILE_TAG"

    invoke-direct {v2, v3}, La7/i;-><init>(Ljava/lang/String;)V

    .line 4
    invoke-static {v0, v1}, La7/i;->c(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, La7/i;->i(Ljava/lang/String;)V

    .line 5
    invoke-static {}, Lbc/c;->d()Lbc/c;

    move-result-object v0

    invoke-virtual {v0, v2}, Lbc/c;->j(Ljava/lang/Object;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 6
    invoke-virtual {p1, v0, v1}, Ll9/a;->a(ZLorg/json/JSONObject;)V

    :cond_0
    return-void
.end method
