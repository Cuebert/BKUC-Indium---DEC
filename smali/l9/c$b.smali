.class Ll9/c$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll9/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Ll9/c;


# direct methods
.method private constructor <init>(Ll9/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ll9/c$b;->a:Ll9/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Ll9/c;Ll9/c$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Ll9/c$b;-><init>(Ll9/c;)V

    return-void
.end method


# virtual methods
.method public executeRoblox(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    iget-object v0, p0, Ll9/c$b;->a:Ll9/c;

    iget-object v0, v0, Ll9/c;->n:Landroid/os/Handler;

    new-instance v1, Ll9/c$b$a;

    invoke-direct {v1, p0, p1}, Ll9/c$b$a;-><init>(Ll9/c$b;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
