.class Lh8/p$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh8/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# static fields
.field public static final a:Lh8/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lh8/p;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lh8/p;-><init>(Lh8/p$a;)V

    sput-object v0, Lh8/p$c;->a:Lh8/p;

    return-void
.end method
