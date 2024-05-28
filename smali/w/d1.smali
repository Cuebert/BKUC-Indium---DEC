.class public interface abstract Lw/d1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/a2;


# static fields
.field public static final f:Lw/o0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/o0$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-string v1, "camerax.core.imageInput.inputFormat"

    .line 2
    invoke-static {v1, v0}, Lw/o0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/o0$a;

    move-result-object v0

    sput-object v0, Lw/d1;->f:Lw/o0$a;

    return-void
.end method


# virtual methods
.method public abstract q()I
.end method
