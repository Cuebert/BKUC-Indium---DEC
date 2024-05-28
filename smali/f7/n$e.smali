.class Lf7/n$e;
.super Lf7/j0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf7/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "e"
.end annotation


# instance fields
.field final synthetic t:Lf7/n;


# direct methods
.method private constructor <init>(Lf7/n;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lf7/n$e;->t:Lf7/n;

    invoke-direct {p0}, Lf7/j0;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lf7/n;Lf7/n$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lf7/n$e;-><init>(Lf7/n;)V

    return-void
.end method


# virtual methods
.method public h(I)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "setting orientation: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.game.orientation"

    invoke-static {v1, v0}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Lf7/n$e;->t:Lf7/n;

    invoke-virtual {v0}, Lf7/n;->C()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    return-void
.end method
