.class Lf9/g$g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf9/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "g"
.end annotation


# static fields
.field public static final a:Lf9/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lf9/g;->a()Lf9/g$c;

    move-result-object v0

    invoke-interface {v0}, Lf9/g$c;->a()Lf9/g;

    move-result-object v0

    sput-object v0, Lf9/g$g;->a:Lf9/g;

    return-void
.end method
