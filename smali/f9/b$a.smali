.class Lf9/b$a;
.super Lf9/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf9/b;-><init>(Landroid/app/Activity;Landroid/view/SurfaceView;Lf9/b$e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lf9/b;


# direct methods
.method constructor <init>(Lf9/b;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lf9/b$a;->d:Lf9/b;

    invoke-direct {p0, p2}, Lf9/f;-><init>(Landroid/app/Activity;)V

    return-void
.end method


# virtual methods
.method protected b(I)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Layout orientation changed. newRotation = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "rbx.game.orientation"

    invoke-static {v0, p1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object p1, p0, Lf9/b$a;->d:Lf9/b;

    invoke-static {p1}, Lf9/b;->c(Lf9/b;)V

    return-void
.end method
