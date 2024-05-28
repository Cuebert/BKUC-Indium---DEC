.class Ll9/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/b$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll9/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Ll9/b;


# direct methods
.method private constructor <init>(Ll9/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ll9/b$c;->a:Ll9/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Ll9/b;Ll9/b$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Ll9/b$c;-><init>(Ll9/b;)V

    return-void
.end method


# virtual methods
.method public a(Ll9/a;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ll9/a;->f()Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "functionName"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2
    iget-object v1, p0, Ll9/b$c;->a:Ll9/b;

    invoke-virtual {v1, v0}, Ll9/b;->c(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    .line 3
    invoke-virtual {p1, v0, v1}, Ll9/a;->a(ZLorg/json/JSONObject;)V

    return-void
.end method
