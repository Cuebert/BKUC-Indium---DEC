.class Lz/e$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# instance fields
.field a:Lw/o2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/o2<",
            "*>;"
        }
    .end annotation
.end field

.field b:Lw/o2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/o2<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lw/o2;Lw/o2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw/o2<",
            "*>;",
            "Lw/o2<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lz/e$c;->a:Lw/o2;

    .line 3
    iput-object p2, p0, Lz/e$c;->b:Lw/o2;

    return-void
.end method
