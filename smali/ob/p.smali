.class public interface abstract Lob/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lob/p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lob/p$a;

    invoke-direct {v0}, Lob/p$a;-><init>()V

    sput-object v0, Lob/p;->a:Lob/p;

    return-void
.end method


# virtual methods
.method public abstract a(Lob/z;Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lob/z;",
            "Ljava/util/List<",
            "Lob/o;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract b(Lob/z;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lob/z;",
            ")",
            "Ljava/util/List<",
            "Lob/o;",
            ">;"
        }
    .end annotation
.end method
