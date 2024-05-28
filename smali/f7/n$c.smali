.class Lf7/n$c;
.super Landroid/os/CountDownTimer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf7/n;->b0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lf7/n;


# direct methods
.method constructor <init>(Lf7/n;JJ)V
    .locals 0

    iput-object p1, p0, Lf7/n$c;->a:Lf7/n;

    invoke-direct {p0, p2, p3, p4, p5}, Landroid/os/CountDownTimer;-><init>(JJ)V

    return-void
.end method


# virtual methods
.method public onFinish()V
    .locals 2

    const-string v0, "ExperienceSession"

    const-string v1, "CountDownTimer::onFinish -> onGameTimeoutInBackground()"

    .line 1
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Lf7/n$c;->a:Lf7/n;

    invoke-static {v0}, Lf7/n;->v(Lf7/n;)V

    return-void
.end method

.method public onTick(J)V
    .locals 0

    return-void
.end method
