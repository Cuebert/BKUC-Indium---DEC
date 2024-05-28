.class Lf7/w$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz6/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf7/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field private final a:J

.field final synthetic b:Lf7/w;


# direct methods
.method public constructor <init>(Lf7/w;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Lf7/w$a;->b:Lf7/w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p2, p0, Lf7/w$a;->a:J

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 2

    .line 1
    iget-wide v0, p0, Lf7/w$a;->a:J

    const-string p1, "SessionReporterState_GameLoadStart"

    invoke-static {p1, v0, v1}, Lq8/a;->b(Ljava/lang/String;J)V

    .line 2
    iget-object p1, p0, Lf7/w$a;->b:Lf7/w;

    invoke-static {p1}, Lf7/w;->i(Lf7/w;)Landroid/view/SurfaceView;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/SurfaceView;->setVisibility(I)V

    return-void
.end method
