.class Lj5/d0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp5/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj5/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final b:Lp5/c;


# direct methods
.method public constructor <init>(Ljava/util/Set;Lp5/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;",
            "Lp5/c;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lj5/d0$a;->a:Ljava/util/Set;

    .line 3
    iput-object p2, p0, Lj5/d0$a;->b:Lp5/c;

    return-void
.end method
