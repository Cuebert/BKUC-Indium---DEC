.class Ll7/g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/b$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll7/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Ll7/g;


# direct methods
.method private constructor <init>(Ll7/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ll7/g$b;->a:Ll7/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Ll7/g;Ll7/g$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Ll7/g$b;-><init>(Ll7/g;)V

    return-void
.end method


# virtual methods
.method public a(Ll9/a;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RBHybridModuleOverlay CloseOverlay.execute() "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ll9/a;->f()Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "RBHybridModuleOverlay"

    invoke-static {v0, p1}, Lc9/k;->h(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-static {}, Lbc/c;->d()Lbc/c;

    move-result-object p1

    new-instance v0, La7/d;

    invoke-direct {v0}, La7/d;-><init>()V

    invoke-virtual {p1, v0}, Lbc/c;->j(Ljava/lang/Object;)V

    return-void
.end method
