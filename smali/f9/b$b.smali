.class Lf9/b$b;
.super Landroid/view/OrientationEventListener;
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
.field final synthetic a:Lf9/b;


# direct methods
.method constructor <init>(Lf9/b;Landroid/content/Context;I)V
    .locals 0

    iput-object p1, p0, Lf9/b$b;->a:Lf9/b;

    invoke-direct {p0, p2, p3}, Landroid/view/OrientationEventListener;-><init>(Landroid/content/Context;I)V

    return-void
.end method


# virtual methods
.method public onOrientationChanged(I)V
    .locals 0

    iget-object p1, p0, Lf9/b$b;->a:Lf9/b;

    invoke-static {p1}, Lf9/b;->c(Lf9/b;)V

    return-void
.end method
